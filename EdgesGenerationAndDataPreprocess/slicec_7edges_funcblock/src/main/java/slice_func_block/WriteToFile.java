package slice_func_block;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.internal.core.dom.parser.cpp.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiao
 * @date 201911/14 15:03
 * @desciption write to file.
 */
public class WriteToFile {

    public static void sourceCodeAndNode(IASTDeclaration decl, String savepath, int label) {
        try {
            if (decl instanceof CPPASTFunctionDefinition) {

                String funContent = decl.getRawSignature();
                //文件的存储路径.

                FileWriter fw = new FileWriter(new File(savepath));//append:true表示追加.
                BufferedWriter bw = new BufferedWriter(fw);
                List<IASTNode> list_B = new ArrayList<IASTNode>();

                // 写入源码内容
                bw.write(funContent);
                bw.write("\n" + label + "\n");
                bw.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");
                bw.flush();

                //广度优先遍历
                list_B.add(decl);
                int num_set = 0;//AST
                int num_c = 0;//CFG
                int num_c2 = 0;
                int num_p = 0;
                int num_p2 = 0;
                int flag_c = 0;
                int flag_p = 0;
                for (int num = 0; num < list_B.size(); num++) {
                    IASTNode B = list_B.get(num);
                    IASTNode[] A = B.getChildren();

                    for (int num_in = 0; num_in < A.length; num_in++) {

                        list_B.add(A[num_in]);

//                        System.out.println("-----------------------------------------------------");
//                        System.out.println(A[num_in].getRawSignature());//内容
//                        System.out.println("------------********************------------------");
//                                                System.out.println("(" + num_set + "," + (list_B.size() - 1) + ",1" + ")");//边和关系
                        bw.write(num_set + "," + (list_B.size() - 1) + ",1" + "\n");
                        bw.flush();
                    }
                    num_set++;

                    if (
                            list_B.get(num) instanceof CPPASTLiteralExpression ||
                                    list_B.get(num) instanceof CPPASTEqualsInitializer ||
                                    list_B.get(num) instanceof CPPASTDeclarator
                    ) {
                        continue;
                    } else if (list_B.get(num) instanceof CPPASTNamedTypeSpecifier ||
                            list_B.get(num) instanceof CPPASTName ||
                            list_B.get(num) instanceof CPPASTIdExpression ||
                            list_B.get(num) instanceof CPPASTPointer || //操作符
                            list_B.get(num) instanceof CPPASTSimpleDeclSpecifier) {

                        if (flag_p == 0) {
                            num_p = num;
                            flag_p = 1;
                        } else {
                            num_p2 = num;
//                            System.out.println("-----------------------------------------------------");
//                            System.out.println(list_B.get(num_p).getRawSignature());
//                            System.out.println("--------********************************-------");
//                            System.out.println(list_B.get(num_p).getClass().getSimpleName());//类型

//                                                    System.out.println("(" + num_p + "," + num_p2 + ",2" + ")");//CFG边的依赖
                            bw.write(num_p + "," + num_p2 + ",2" + "\n");
                            bw.flush();
                            num_p = num_p2;
                        }
                    }
//
                    else {

                        if (flag_c == 0) {
                            num_c = num;
                            flag_c = 1;
                        } else {
                            num_c2 = num;
//                            System.out.println("-----------------------------------------------------");
//                            System.out.println(list_B.get(num_c).getRawSignature());
//                            System.out.println("--------********************************-------");
//                            System.out.println(list_B.get(num_c).getClass().getSimpleName());//类型
//                                                    System.out.println("(" + num_c + "," + num_c2 + ",3" + ")");//CFG边的依赖
                            bw.write(num_c + "," + num_c2 + ",3" + "\n");
                            bw.flush();
                            num_c = num_c2;
                        }
                    }

                }
                bw.write(label + "");
                bw.write("\n------------------------------------");
                bw.flush();
                bw.close();
            }
        } catch (Exception e) {
            System.out.println("Error in class SourceCodeAndNode.WriteToFile eventually.I dont know why as well.");
            e.printStackTrace();
        }
    }

    public static void sourceCode(IASTDeclaration decl, String savepath) {
        try {
            if (decl instanceof CPPASTFunctionDefinition) {

                String funContent = decl.getRawSignature();
                //文件的存储路径.

                FileWriter fw = new FileWriter(new File(savepath));//append:true表示追加.
                BufferedWriter bw = new BufferedWriter(fw);
                // 写入源码内容
                bw.write(funContent);
                bw.write('\n');
                bw.write('0');
                bw.write("\n------------------------------------");
                bw.flush();
            }
        } catch (Exception e) {
            System.out.println("Error in class SourceCodeAndNode.WriteToFile eventually.I dont know why as well.");
            e.printStackTrace();
        }
    }
}
