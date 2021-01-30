package sevenEdges;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;
import sevenEdges.nodeTraversal.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;


/**
 * 7 edges of c.
 */
public class Main {
    static Pattern good = Pattern.compile(".*[Gg][Oo][Oo][Dd].*");
    static Pattern bad = Pattern.compile(".*[Bb][Aa][Dd].*");


    public static void main(String[] args) {
    
        if (args.length != 2) {
            System.out.println("please enter the appropriate parameters");
            return;
        }
        String sourceFilePath = args[0];
        String storeFilePath = args[1];

        int batchsize = 10;
        int batchnum_lastrun = 0;
        File file = new File(sourceFilePath);
        File[] fs = file.listFiles();


        if (fs != null) {
            int count = 0;
            for (File f : fs) {
                count++;
            }


            int line_count = 0;
            int batchnum_now = 0;

            for (File f : fs) {
                line_count = line_count + 1;
                if (!(batchnum_now == ((line_count - 1) / batchsize + 1))) {
                    batchnum_now = (line_count / batchsize + 1);
                    double c = ((batchnum_now - 1) * batchsize / (count * 1.0)) * 100;
                    System.out.printf("%s%.2f%s%s%d\n", "finished:", c, "%", "   Batch ", batchnum_now);
                }
                if (batchnum_now <= batchnum_lastrun) {
                    continue;
                } else {
                    if (!f.isDirectory()) {
                        try {


                            FileContent fileContent = FileContent.createForExternalFileLocation(f.toString());
                            Map definedSymbols = new HashMap();
                            String[] includePaths = new String[0];
                            IScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
                            IParserLogService log = new DefaultLogService();
                            IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();
                            int opts = 8;
                            IASTTranslationUnit translationUnit = GPPLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);

                            //FunctionDeclaration
                            IASTDeclaration[] declarations = translationUnit.getDeclarations();
                            int funcNum = 0;
                            if (f.getName().endsWith(".c")) {
                                for (IASTDeclaration decl : declarations) {
                                    if (decl instanceof CPPASTFunctionDefinition) {
                                        String funcName = String.valueOf(((CPPASTFunctionDefinition) decl).getDeclarator().getName());
                                        String savepath = storeFilePath + File.separator + f.getName() + "-" + funcName + ".txt";

                                        if (!(bad.matcher(funcName).matches()) && (!good.matcher(funcName).matches())) {
                                            continue;
                                        }

                                        if (!new File(storeFilePath).exists()) {
                                            new File(storeFilePath).mkdirs();
                                        }
                                        if (!new File(savepath).exists()) {
                                            new File(savepath).createNewFile();
                                        }


                                        int label = 1;

                                        //append:true
                                        FileWriter fw = new FileWriter(new File(savepath));
                                        BufferedWriter bw = new BufferedWriter(fw);

                                        //label
                                        if ((good.matcher(funcName).matches()) && (!bad.matcher(funcName).matches())) {
                                            label = 0;
                                        }

                                        bw.write("-----label-----\n");
                                        bw.write(label + "\n");

                                        MyVisitor visitor1 = new MyVisitor();
                                        decl.accept(visitor1);

                                        //code
                                        bw.write("-----code-----\n");
                                        bw.write(decl.getRawSignature() + "\n");

                                        // children
                                        bw.write("-----children-----\n");
                                        ArrayList<String> children = visitor1.getChildren();
                                        for (String child : children) {
                                            bw.write(child + "\n");
                                        }

                                        // children
                                        bw.write("-----nextToken-----\n");
                                        ArrayList<Integer> nextToken = visitor1.getNextToken();
                                        StringBuilder temp0 = new StringBuilder();
                                        for (Integer nextOne : nextToken) {
                                            temp0.append(nextOne + ",");
                                        }
                                        bw.write(temp0.subSequence(0, temp0.length() - 1) + "\n");

                                        //computeFrom
                                        bw.write("-----computeFrom-----\n");
                                        ArrayList<String> computedFroms = visitor1.getComputedFrom();
                                        for (String computedFrom : computedFroms) {
                                            bw.write(computedFrom + "\n");
                                        }

                                        //guardedBy
                                        bw.write("-----guardedBy-----\n");
                                        ArrayList<String> guardedBys = visitor1.getGuardedBy();
                                        for (String guardedBy : guardedBys) {
                                            if (!guardedBy.contains("null")) {
                                                bw.write(guardedBy + "\n");
                                            }
                                        }
                                        //guardedByNegation
                                        bw.write("-----guardedByNegation-----\n");
                                        ArrayList<String> guardedByNegations = visitor1.getGuardedByNegation();
                                        for (String guardedByNegation : guardedByNegations) {
                                            if (!guardedByNegation.contains("null")) {
                                                bw.write(guardedByNegation + "\n");
                                            }
                                        }

                                        //lastLexicalUse
                                        bw.write("-----lastLexicalUse-----\n");
                                        ArrayList<String> lastLexicalUses = visitor1.getLastLexicalUse();
                                        for (String lastLexicalUse : lastLexicalUses) {
                                            if (!lastLexicalUse.contains("null")) {
                                                bw.write(lastLexicalUse + "\n");
                                            }
                                        }

                                        //jump
                                        bw.write("-----jump-----\n");
                                        ArrayList<String> jumps = visitor1.getLastLexicalUse();
                                        for (String jump : jumps) {
                                            if (!jump.contains("null")) {
                                                bw.write(jump + "\n");
                                            }
                                        }

                                        //attribute
                                        StringBuilder attribute = visitor1.getNodeType();
                                        bw.write("-----attribute-----\n");
                                        bw.write(attribute.toString());

                                            //"-----ast_node-----"
                                        bw.write("\n-----ast_node-----\n");
                                        ArrayList<String> ast_node = visitor1.getAst_node();
                                        for (String e : ast_node) {
                                            bw.write(e + "\n");
                                        }
                                        bw.flush();
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            continue;
                        }
                    }
                }
            }
        }
    }
}
