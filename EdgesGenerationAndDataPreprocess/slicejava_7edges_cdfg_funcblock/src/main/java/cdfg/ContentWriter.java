package cdfg;

import cdfg.ast.TinyPDGASTVisitor;
import cdfg.ast.main.ASTGenerator;
import cdfg.ast.structure.MyMethodNode;
import cdfg.cfg.CFG;
import cdfg.cfg.edge.CFGEdge;
import cdfg.cfg.node.CFGControlNode;
import cdfg.cfg.node.CFGNode;
import cdfg.cfg.node.CFGNodeFactory;
import cdfg.pdg.PDG;
import cdfg.pdg.edge.PDGControlDependenceEdge;
import cdfg.pdg.edge.PDGDataDependenceEdge;
import cdfg.pdg.edge.PDGEdge;
import cdfg.pdg.edge.PDGExecutionDependenceEdge;
import cdfg.pdg.node.*;
import cdfg.pe.MethodInfo;
import cdfg.pe.ProgramElementInfo;
import org.eclipse.jdt.core.dom.CompilationUnit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * content information of nodes.
 */
public class ContentWriter {
    public static void main(String[] args) throws Exception {
        String path = "E:\\IdeaProjects\\codeGraph\\src\\main\\resources\\test";
        String savepath = "E:\\IdeaProjects\\codeGraph\\src\\main\\resources\\output\\content";
        if (!new File(savepath).exists()) {
            new File(savepath).mkdirs();
        }
        //dot -Tpng -o cfg.png Test_cfg.dot
        File[] files = new File(path).listFiles();

        for (File file : files) {
            final List<MethodInfo> methods = new ArrayList<MethodInfo>();
            final CompilationUnit unit = TinyPDGASTVisitor.createAST(file);
            final List<MethodInfo> m = new ArrayList<MethodInfo>();
            final TinyPDGASTVisitor visitor = new TinyPDGASTVisitor(
                    file.getAbsolutePath(), unit, methods);
            unit.accept(visitor);
            methods.addAll(m);
            int createdGraphNumber = 0;
            //ast
            ASTGenerator astGenerator = new ASTGenerator(file);
            List<MyMethodNode> methodNodeList = astGenerator.getMethodNodeList();

            for (MyMethodNode m1 : methodNodeList) {
                String astPath = savepath + "\\" + file.getName().split(".java")[0] + "_method"
                        + (createdGraphNumber++) + "_ast" + "_"
                        + UUID.randomUUID() + ".dot";
                BufferedWriter astwriter = new BufferedWriter(new FileWriter(new File(astPath)));
                writeMethodAst(m1, astwriter);
                astwriter.close();
            }

            //cfg和pdg全部写在一个.dot文件里,需要修改到多个文件。.dot转图希望在代码运行，从命令行转到代码行。
            //cfg
            System.out.println("building and outputing PDGs ...");
            final CFGNodeFactory nodeFactory = new CFGNodeFactory();
            String cfgPath = savepath + "\\" + file.getName().split(".java")[0] + "_cfg" + ".dot";
            BufferedWriter cfgwriter = new BufferedWriter(new FileWriter(new File(cfgPath)));

            cfgwriter.write("digraph CFG {");
            cfgwriter.newLine();

            createdGraphNumber = 0;
            for (final MethodInfo method : methods) {


                final CFG cfg = new CFG(method, nodeFactory);
                cfg.build();
                cfg.removeSwitchCases();
                cfg.removeJumpStatements();
                writeMethodCFG(cfg, createdGraphNumber++, cfgwriter);


            }
            cfgwriter.write("}");
            cfgwriter.close();


            //pdg

            System.out.println("building and outputing PDGs ...");
            String pdgPath = savepath + "\\" + file.getName().split(".java")[0] + "_pdg" + ".dot";
            if (!new File(pdgPath).exists()) {
                new File(pdgPath).createNewFile();
            }
            BufferedWriter pdgwriter = new BufferedWriter(new FileWriter(new File(pdgPath)));

            pdgwriter.write("digraph PDG {");
            pdgwriter.newLine();
            pdgwriter.newLine();

            createdGraphNumber = 0;
            for (final MethodInfo method : methods) {

                final PDG pdg = new PDG(method, new PDGNodeFactory(),
                        new CFGNodeFactory(), true, true, true);
                pdg.build();
                writePDG(pdg, createdGraphNumber++, pdgwriter);
            }
            pdgwriter.write("}");
            pdgwriter.close();
        }
    }


    static private String getMethodSignature(final MethodInfo method) {

        final StringBuilder text = new StringBuilder();

        text.append(method.name);
        text.append(" <");
        text.append(method.startLine);
        text.append("...");
        text.append(method.endLine);
        text.append(">");

        return text.toString();
    }


    static private void writeMethodCFG(final CFG cfg,
                                       final int createdGraphNumber, final BufferedWriter writer)
            throws IOException {

        writer.write("subgraph cluster");
        writer.write(Integer.toString(createdGraphNumber));
        writer.write(" {");
        writer.newLine();

        writer.write("label = \"");
        writer.write(getMethodSignature((MethodInfo) cfg.core));
        writer.write("\";");
        writer.newLine();

        final SortedMap<CFGNode<? extends ProgramElementInfo>, Integer> nodeLabels = new TreeMap<CFGNode<? extends ProgramElementInfo>, Integer>();
        for (final CFGNode<?> node : cfg.getAllNodes()) {
            nodeLabels.put(node, nodeLabels.size());
        }

        for (final Map.Entry<CFGNode<? extends ProgramElementInfo>, Integer> entry : nodeLabels
                .entrySet()) {

            final CFGNode<? extends ProgramElementInfo> node = entry.getKey();
            final Integer label = entry.getValue();

            writer.write(Integer.toString(createdGraphNumber));
            writer.write(".");
            writer.write(Integer.toString(label));
            writer.write(" [style = filled, label = \"");
            writer.write(node.getText().replace("\"", "\\\"")
                    .replace("\\\\\"", "\\\\\\\""));
            writer.write("\"");

            final CFGNode<? extends ProgramElementInfo> enterNode = cfg
                    .getEnterNode();
            final SortedSet<CFGNode<? extends ProgramElementInfo>> exitNodes = cfg
                    .getExitNodes();

            if (enterNode == node) {
                writer.write(", fillcolor = aquamarine");
            } else if (exitNodes.contains(node)) {
                writer.write(", fillcolor = deeppink");
            } else {
                writer.write(", fillcolor = white");
            }

            if (node instanceof CFGControlNode) {
                writer.write(", shape = diamond");
            } else {
                writer.write(", shape = ellipse");
            }

            writer.write("];");
            writer.newLine();
        }

        writeCFGEdges(cfg, nodeLabels, createdGraphNumber, writer);

        writer.write("}");
        writer.newLine();
    }

    static private void writeCFGEdges(
            final CFG cfg,
            final Map<CFGNode<? extends ProgramElementInfo>, Integer> nodeLabels,
            final int createdGraphNumber, final BufferedWriter writer)
            throws IOException {

        if (null == cfg) {
            return;
        }

        final SortedSet<CFGEdge> edges = new TreeSet<CFGEdge>();
        for (final CFGNode<?> node : cfg.getAllNodes()) {
            edges.addAll(node.getBackwardEdges());
            edges.addAll(node.getForwardEdges());
        }

        for (final CFGEdge edge : edges) {
            writer.write(Integer.toString(createdGraphNumber));
            writer.write(".");
            writer.write(Integer.toString(nodeLabels.get(edge.fromNode)));
            writer.write(" -> ");
            writer.write(Integer.toString(createdGraphNumber));
            writer.write(".");
            writer.write(Integer.toString(nodeLabels.get(edge.toNode)));
            writer.write(" [style = solid, label=\""
                    + edge.getDependenceString() + "\"];");
            writer.newLine();
        }
    }


    static private void writePDG(final PDG pdg, final int createdGraphNumber,
                                 final BufferedWriter writer) throws IOException {

        final MethodInfo method = pdg.unit;

        writer.write("subgraph cluster");
        writer.write(Integer.toString(createdGraphNumber));
        writer.write(" {");
        writer.newLine();

        writer.write("label = \"");
        writer.write(getMethodSignature(method));
        writer.write("\";");
        writer.newLine();

        final Map<PDGNode<?>, Integer> nodeLabels = new HashMap<PDGNode<?>, Integer>();
        for (final PDGNode<?> node : pdg.getAllNodes()) {
            nodeLabels.put(node, nodeLabels.size());
        }

        for (final Map.Entry<PDGNode<?>, Integer> entry : nodeLabels.entrySet()) {
            writer.write(Integer.toString(createdGraphNumber));
            writer.write(".");
            writer.write(Integer.toString(entry.getValue()));
            writer.write(" [style = filled, label = \"");
            writer.write(entry.getKey().getText().replace("\"", "\\\"")
                    .replace("\\\\\"", "\\\\\\\""));
            writer.write("\"");

            final PDGNode<?> node = entry.getKey();
            if (node instanceof PDGMethodEnterNode) {
                writer.write(", fillcolor = aquamarine");
            } else if (pdg.getExitNodes().contains(node)) {
                writer.write(", fillcolor = deeppink");
            } else if (node instanceof PDGParameterNode) {
                writer.write(", fillcolor = tomato");
            } else {
                writer.write(", fillcolor = white");
            }

            if (node instanceof PDGControlNode) {
                writer.write(", shape = diamond");
            } else if (node instanceof PDGParameterNode) {
                writer.write(", shape = box");
            } else {
                writer.write(", shape = ellipse");
            }

            writer.write("];");
            writer.newLine();
        }

        for (final PDGEdge edge : pdg.getAllEdges()) {
            writer.write(Integer.toString(createdGraphNumber));
            writer.write(".");
            writer.write(Integer.toString(nodeLabels.get(edge.fromNode)));
            writer.write(" -> ");
            writer.write(Integer.toString(createdGraphNumber));
            writer.write(".");
            writer.write(Integer.toString(nodeLabels.get(edge.toNode)));
            if (edge instanceof PDGDataDependenceEdge) {
                writer.write(" [style = solid, label=\""
                        + edge.getDependenceString() + "\"]");
            } else if (edge instanceof PDGControlDependenceEdge) {
                writer.write(" [style = dotted, label=\""
                        + edge.getDependenceString() + "\"]");
            } else if (edge instanceof PDGExecutionDependenceEdge) {
                writer.write(" [style = bold, label=\""
                        + edge.getDependenceString() + "\"]");
            }
            writer.write(";");
            writer.newLine();
        }

        writer.write("}");
        writer.newLine();
    }

    static private void writeMethodAst(MyMethodNode m, BufferedWriter writer) throws IOException {

        String str = "digraph \"AST\" {\n";
        str += ("graph [label = \"" + m.methodNode.getName() + "\", labelloc=t, concentrate = true];\n");

        //节点具体内容，画图的话用这个。
        for (String[] k : m.mapping) {
            String pHashcode = k[0].replaceAll("\"", "");
            String hashcode = k[1].replaceAll("\"", "");
            str += ("\"" + pHashcode + "\" -> \"" + hashcode + "\"\n");
        }

        str += "}\n";
        writer.write(str);


        //数字关系画图的话用这个

//        //mapping中存放了节点关系.
//        ArrayList<String[]> arrayList = (ArrayList<String[]>) m.mapping;
//
//        //存放每个节点，设置唯一编号，以便构建节点关系。
//        Map<String, Integer> mapId = new HashMap<>();
//        int count = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            for (int j = 0; j < arrayList.get(i).length; j++) {
//                if (!mapId.containsKey(arrayList.get(i)[j])) {
//                    mapId.put(arrayList.get(i)[j], count++);
//                }
//
//            }
//        }
//
//        //和mapping中对应起来.
//        for (String[] k : m.mapping) {
//            int pHashcodenum = 0;
//            int hashcodenum = 0;
//            //下面一句可以不要,因为k[0],k[1]一定是在mapId里的.加上判断一下也无妨
//            if (mapId.containsKey(k[0]) && mapId.containsKey(k[1])) {
//                pHashcodenum = mapId.get(k[0]);
//                hashcodenum = mapId.get(k[1]);
//                str += ("\"" + pHashcodenum + "\" -> \"" + hashcodenum + "\"\n");
//            }
//        }
//        writer.write(str);
//        writer.write("}\n");
//        writer.close();


    }
}