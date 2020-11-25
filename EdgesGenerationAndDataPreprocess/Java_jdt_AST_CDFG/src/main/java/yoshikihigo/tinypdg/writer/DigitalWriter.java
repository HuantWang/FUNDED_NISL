package yoshikihigo.tinypdg.writer;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import yoshikihigo.tinypdg.ast.TinyPDGASTVisitor;
import yoshikihigo.tinypdg.ast.main.ASTGenerator;
import yoshikihigo.tinypdg.ast.main.ASTtoDOT;
import yoshikihigo.tinypdg.ast.structure.MyMethodNode;
import yoshikihigo.tinypdg.cfg.CFG;
import yoshikihigo.tinypdg.cfg.edge.CFGEdge;
import yoshikihigo.tinypdg.cfg.node.CFGNode;
import yoshikihigo.tinypdg.cfg.node.CFGNodeFactory;
import yoshikihigo.tinypdg.pdg.PDG;
import yoshikihigo.tinypdg.pdg.edge.PDGEdge;
import yoshikihigo.tinypdg.pdg.node.PDGNode;
import yoshikihigo.tinypdg.pdg.node.PDGNodeFactory;
import yoshikihigo.tinypdg.pe.MethodInfo;
import yoshikihigo.tinypdg.pe.ProgramElementInfo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * digital information of nodes.
 */

public class DigitalWriter {
    //each sourcecode is mapped to a unique number.
    static Map<String, Integer> mappingOfSourceAndNodeNum = new HashMap<String, Integer>();

    static Set<String> logSet = new HashSet<String>();


    public static void sard(String FilePath, String storeFilePath, int batchsize, int batchnum_lastrun) throws IOException {
        File[] files = new File(FilePath).listFiles();
        //count numbers of all files
        if (files != null) {
            int count = 0;
            for (File file : files) {
                count++;
            }

            //control process
            int line_count = 0;
            int batchnum_now = 0;


            for (File file : files) {

                line_count = line_count + 1;
                if (!(batchnum_now == ((line_count - 1) / batchsize + 1))) {
                    batchnum_now = (line_count / batchsize + 1);
                    double c = ((batchnum_now - 1) * batchsize / (count * 1.0)) * 100;
                    System.out.printf("%s%.2f%s%s%d\n", "finished:", c, "%", "   Batch ", batchnum_now);
                }
                if (batchnum_now <= batchnum_lastrun) {
                    continue;
                } else {
                    try {
                        int createdGraphNumber = 0;
//                        Pattern good
                        Pattern good = Pattern.compile(".*[Gg][Oo][Oo][Dd].*");
                        Pattern bad = Pattern.compile(".*[Bb][Aa][Dd].*");

                        //AST
                        ASTGenerator astGenerator = new ASTGenerator(file);
                        List<MyMethodNode> methodNodeList = astGenerator.getMethodNodeList();

                        for (int i = 0; i < methodNodeList.size(); i++) {

                            String funcName = methodNodeList.get(i).methodNode.getName().toString()
                                    .split("\\.")[0];
                            String fileName = file.getName().split(".txt")[0];


                            int label = 1;
                            String filePath = storeFilePath + "\\" + fileName + "$" + funcName + ".txt";
                            if ((good.matcher(funcName).matches()) && (!bad.matcher(funcName).matches())) {
                                label = 0;
                                //path of files stored.
//                                filePath = storeFilePath + "\\" + "good" + "\\" + fileName + "$" + funcName + ".txt";
//                                if (!new File(storeFilePath + "\\" + "good").exists()) {
//                                    new File(storeFilePath + "\\" + "good").mkdirs();
//                                }
//
//                                if (!new File(filePath).exists()) {
//                                    new File(filePath).createNewFile();
//                                }
                            }

                            if ((bad.matcher(funcName).matches()) && (!good.matcher(funcName).matches())) {
                                label = 1;
                                //path of files stored.
//                                filePath = storeFilePath + "\\" + "bad" + "\\" +  fileName + "$" + funcName + ".txt";
//                                if (!new File(storeFilePath + "\\" + "bad").exists()) {
//                                    new File(storeFilePath + "\\" + "bad").mkdirs();
//                                }
//
//                                if (!new File(filePath).exists()) {
//                                    new File(filePath).createNewFile();
//                                }
                            }

                            if (!new File(storeFilePath ).exists()) {
                                    new File(storeFilePath).mkdirs();
                                }

                                if (!new File(filePath).exists()) {
                                    new File(filePath).createNewFile();
                                }

                            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePath)));
                            // 7 Edges are below.
                            final EdgesVisitor visitor1 = new EdgesVisitor(writer);
                            EdgesVisitor.getDirectChildren(methodNodeList.get(i).methodNode,0);
//                            methodNodeList.get(i).methodNode.accept(visitor1);

                            writer.write("-----label-----\n");
                            writer.write(label+"\n");
                            writer.write("-----code-----\n");
                            writer.write(methodNodeList.get(i).methodNode.toString());
                            writer.write("\n-----children-----\n");
                            mappingOfSourceAndNodeNum = ASTtoDOT.AST(
                                    methodNodeList.get(i), writer);
                            writer.write("-----nextToken-----\n");
                            writer.write(EdgesVisitor.getNextTokens()+"\n");
                            writer.write("-----computeFrom-----\n");
                            writer.write("-----guardedBy-----\n");
                            writer.write("-----guardedByNegation-----\n");
                            writer.write("-----lastLexicalUse-----\n");
                            writer.write("----------jump----------\n");
                            writer.write("-----attribute-----\n");
                            writer.write(EdgesVisitor.getAttributes());
                            // ast part.
                            writer.write("\n-----joern-----\n");
                            mappingOfSourceAndNodeNum = ASTtoDOT.ASTtoDotParser(
                                    methodNodeList.get(i), writer, label);

                            //cfg and pdg
                            final List<MethodInfo> methods = new ArrayList<MethodInfo>();
                            final CompilationUnit unit = TinyPDGASTVisitor.createAST(file);
                            final List<MethodInfo> m = new ArrayList<MethodInfo>();
                            final TinyPDGASTVisitor visitor = new TinyPDGASTVisitor(
                                    file.getAbsolutePath(), unit, methods);
                            unit.accept(visitor);
                            methods.addAll(m);

                            final CFGNodeFactory nodeFactory = new CFGNodeFactory();
//                            System.out.println(file);
                            //包含static class{} 的代码会出错，处理一下。
                            MethodInfo method = methods.get(i);

                            //cfg
                            final CFG cfg = new CFG(method, nodeFactory);
                            cfg.build();
                            cfg.removeSwitchCases();
                            cfg.removeJumpStatements();
                            writeMethodCFG(cfg, writer, file);
                            writer.flush();

                            //pdg
                            final PDG pdg = new PDG(method, new PDGNodeFactory(),
                                    new CFGNodeFactory(), true, true, true);
                            pdg.build();
                            writePDG(pdg, createdGraphNumber, writer, file);

                            writer.write("------------------------------------\n");
                            // node contents.

                            mappingOfSourceAndNodeNum.forEach((k, v) -> {
                                try {
                                    writer.write("(" + v + "," + k.replaceAll("\n", "")
                                            .replaceAll("\r", "")
                                            .replaceAll("\n\r", "")
                                            .replaceAll("\r\n", "") + ")\n");
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            });

                            writer.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
//                            writer.write(label + "");
                            writer.flush();
                            writer.close();

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("wrong!");
//                        bufferedWriterlog.write(file.getName().split(".java")[0]
//                                + ".txt" + "\n");
//                        bufferedWriterlog.flush();
                        continue;
                    }
                }

            }
        }
    }


    static public void writeMethodCFG(final CFG cfg, final BufferedWriter writer, final File file)
            throws IOException {
        //Each source code is mapped to a unique number
        Map<String, String> cfgNode = new HashMap<String, String>();
        //edgRelationship stores the relationships of every edge and unique number.
        Map<String, Set<String>> edgRelationship = new HashMap<String, Set<String>>();
        Set<String> nextEdg = new HashSet<String>();
        final SortedMap<CFGNode<? extends ProgramElementInfo>, Integer> nodeLabels = new TreeMap<CFGNode<? extends ProgramElementInfo>, Integer>();

        //cfgNode add datas
        for (final CFGNode<?> node : cfg.getAllNodes()) {
            nodeLabels.put(node, nodeLabels.size());
        }

        for (final Map.Entry<CFGNode<? extends ProgramElementInfo>, Integer> entry : nodeLabels
                .entrySet()) {

            final CFGNode<? extends ProgramElementInfo> node = entry.getKey();
            final Integer label = entry.getValue();

            String num = String.valueOf(label);
            String nodeSourceCode = node.getText()
                    .replace("\"", "\\\"")
                    .replace("\\\\\"", "\\\\\\\"");
            if (!cfgNode.containsKey(nodeSourceCode)) {
                cfgNode.put(num, nodeSourceCode);
            }
        }


        //edgRelationship add datas
        final SortedSet<CFGEdge> edges = new TreeSet<CFGEdge>();
        for (final CFGNode<?> node : cfg.getAllNodes()) {
            edges.addAll(node.getBackwardEdges());
            edges.addAll(node.getForwardEdges());
        }

        for (final CFGEdge edge : edges) {
            String numpre = String.valueOf(nodeLabels.get(edge.fromNode));
            String numnext = String.valueOf(nodeLabels.get(edge.toNode));


            nextEdg.add(cfgNode.get(numnext));
            if (edgRelationship.containsKey(cfgNode.get(numpre))) {
                for (String info : edgRelationship.get(cfgNode.get(numpre))) {
                    nextEdg.add(info);
                }
            }
            edgRelationship.put(cfgNode.get(numpre), nextEdg);
            nextEdg = new HashSet<String>();
        }

        //Node content information is converted into numbers.
        if (edgRelationship.size() != 0) {
            for (String nowEdg1 : edgRelationship.keySet()) {
                if (mappingOfSourceAndNodeNum.containsKey(nowEdg1)) {
                    for (String nextEdg1 : edgRelationship.get(nowEdg1)) {
                        if (mappingOfSourceAndNodeNum.get(nowEdg1) != null &&
                                mappingOfSourceAndNodeNum.get(nextEdg1) != null) {
                            writer.write(mappingOfSourceAndNodeNum.get(nowEdg1)
                                    + "," + mappingOfSourceAndNodeNum.get(nextEdg1) + "," + 1);
                            writer.write("\n");
                            writer.flush();
                        }
                        if (mappingOfSourceAndNodeNum.get(nowEdg1) == null ||
                                mappingOfSourceAndNodeNum.get(nextEdg1) == null) {
                            System.out.println("cfg node does't match");
//                            System.out.println("class " + file.getName().split(".java")[0] + " occurs problems...");
//                            exit(-1);
                            logSet.add(file.getName().split(".java")[0] + ".txt" + "\n");
                        }
                    }
                }
                if (!mappingOfSourceAndNodeNum.containsKey(nowEdg1)) {
                    System.out.println("cfg node does't match");
//                    System.out.println("class " + file.getName().split(".java")[0] + " occurs problems...");
//                    exit(-1);
                    logSet.add(file.getName().split(".java")[0] + ".txt" + "\n");
                }
            }
        }
    }


    static private void writePDG(final PDG pdg, final int createdGraphNumber,
                                 final BufferedWriter writer, final File file) throws IOException {

        //Each source code is mapped to a unique number
        Map<String, String> pdgNode = new HashMap<String, String>();
        //edgRelationship
        Map<String, Set<String>> edgRelationship = new HashMap<String, Set<String>>();
        Set<String> nextEdg = new HashSet<String>();

        final Map<PDGNode<?>, Integer> nodeLabels = new HashMap<PDGNode<?>, Integer>();
        for (final PDGNode<?> node : pdg.getAllNodes()) {
            nodeLabels.put(node, nodeLabels.size());
        }

        for (final Map.Entry<PDGNode<?>, Integer> entry : nodeLabels.entrySet()) {
            String num = createdGraphNumber + "." + entry.getValue();
            String sourceCode = entry.getKey().getText().replace("\"", "\\\"")
                    .replace("\\\\\"", "\\\\\\\"");
            if (!pdgNode.containsKey(sourceCode)) {
                pdgNode.put(num, sourceCode);
            }
        }


        //pdg add datas
        for (final PDGEdge edge : pdg.getAllEdges()) {
            String numpre = createdGraphNumber + "." + nodeLabels.get(edge.fromNode);
            String numnext = createdGraphNumber + "." + nodeLabels.get(edge.toNode);


            nextEdg.add(pdgNode.get(numnext));
            if (edgRelationship.containsKey(pdgNode.get(numpre))) {
                for (String info : edgRelationship.get(pdgNode.get(numpre))) {
                    nextEdg.add(info);
                }
            }
            edgRelationship.put(pdgNode.get(numpre), nextEdg);
            nextEdg = new HashSet<String>();
        }

        //Node content information is converted into numbers.
        if (edgRelationship.size() != 0) {
            for (String nowEdg1 : edgRelationship.keySet()) {
                if (mappingOfSourceAndNodeNum.containsKey(nowEdg1) && !nowEdg1.equals("Enter")) {
                    for (String nextEdg1 : edgRelationship.get(nowEdg1)) {
//                    System.out.println(nowEdg1 + "-->"
//                            + nextEdg1);
//                    System.out.println(mappingOfSourceAndNodeNumNew.get(nowEdg1) + "-->"
//                            + mappingOfSourceAndNodeNumNew.get(nextEdg1));
//                    System.out.println("-------------");
                        if (mappingOfSourceAndNodeNum.get(nowEdg1) != null &&
                                mappingOfSourceAndNodeNum.get(nextEdg1) != null) {
                            writer.write(mappingOfSourceAndNodeNum.get(nowEdg1)
                                    + "," + mappingOfSourceAndNodeNum.get(nextEdg1) + "," + 2);
                            writer.write("\n");
                            writer.flush();
                        }

                        if (mappingOfSourceAndNodeNum.get(nowEdg1) == null ||
                                mappingOfSourceAndNodeNum.get(nextEdg1) == null) {
                            System.out.println("pdg node does't match");
//                            System.out.println("class " + file.getName().split(".java")[0] + " occurs problems...");
//                            exit(-1);
                            logSet.add(file.getName().split(".java")[0] + ".txt" + "\n");
                        }
                    }

                }
                if (!mappingOfSourceAndNodeNum.containsKey(nowEdg1) && !nowEdg1.equals("Enter")) {
                    System.out.println("pdg node does't match");
//                    System.out.println("class " + file.getName().split(".java")[0] + " occurs problems...");
                    logSet.add(file.getName().split(".java")[0] + ".txt" + "\n");
                }
            }
        }
    }
}
