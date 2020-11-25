package slice;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.regex.Pattern;

/**
 * AST_extract类处理c语言源码文件,得到1,2,3三种关系,以及源码文件及标记.
 */
public class GoodBad1_1 {

    /**
     * 处理good/bad这种来自sard中的数据
     */
    public static void AST_SardGoodBad(String sourceFilePath, String storeFilePath, int batchnum_lastrun, int batchsize) {
        //创建存储路径
        if (!new File(storeFilePath).exists()) {
            new File(storeFilePath).mkdirs();
        }

        File file = new File(sourceFilePath);
        File[] fs = file.listFiles();    //遍历path下的文件和目录，放在File数组中

        //遍历得到count,方便查看处理速度
        if (fs != null) {
            int count = 0;
            for (File f : fs) {
                count++;
            }

            //控制遍历过的文件.
            int line_count = 0;
            int batchnum_now = 0;

            for (File f : fs) {
                line_count = line_count + 1;
                if (!(batchnum_now == ((line_count - 1) / batchsize + 1))) {
                    batchnum_now = (line_count / batchsize + 1);
                    double c = ((batchnum_now - 1) * batchsize / (count * 1.0)) * 100;
                    System.out.printf("%s%.2f%s%s%d\n", "已完成:", c, "%", "   Batch ", batchnum_now);
                }
                if (batchnum_now <= batchnum_lastrun) {
                    continue;
                } else {
                    if (!f.isDirectory()) {
                        try {
                            //读入内容
                            FileContent fileContent = FileContent.createForExternalFileLocation(f.toString());
                            Map definedSymbols = new HashMap();//哈希表，定义符号
                            String[] includePaths = new String[0];
                            IScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
                            IParserLogService log = new DefaultLogService();
                            IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();
                            int opts = 8;
                            IASTTranslationUnit translationUnit = GPPLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);

                            //主体内容
                            IASTDeclaration[] decls = translationUnit.getDeclarations();

                            for (IASTDeclaration decl : decls) {
                                if (decl instanceof CPPASTFunctionDefinition) {
                                    String funcName = decl.getRawSignature().split("\n")[0].replaceAll("\r", "")
                                            .replaceAll("\n", "");
                                    Pattern good = Pattern.compile(".*[Gg][Oo][Oo][Dd].*");
                                    Pattern bad = Pattern.compile(".*[Bb][Aa][Dd].*");
                                    String funContent = decl.getRawSignature();

                                    if ((good.matcher(funcName).matches()) && (!bad.matcher(funcName).matches())) {
                                        //文件的存储路径.
                                        String savepath = storeFilePath + "\\" + "good" + "\\" + UUID.randomUUID() + ".c";
                                        if (!new File(storeFilePath + "\\" + "good").exists()) {
                                            new File(storeFilePath + "\\" + "good").mkdirs();
                                        }
                                        if (!new File(savepath).exists()) { //文件不存在,new一个文件
                                            new File(savepath).createNewFile();
                                        }
                                        int label = 0;
                                        //文件的存储路径.

                                        FileWriter fw = new FileWriter(new File(savepath));//append:true表示追加.
                                        BufferedWriter bw = new BufferedWriter(fw);
                                        List<IASTNode> list_B = new ArrayList<IASTNode>();

                                        // 写入源码内容
                                        bw.write(funContent);
                                        bw.write("\n" + label + "\n");
                                        bw.write("------------------------------------");
                                        bw.flush();
                                    }


                                    if ((bad.matcher(funcName).matches()) && (!good.matcher(funcName).matches())) {
                                        //文件的存储路径.
                                        String savepath = storeFilePath + "\\" + "bad" + "\\" + UUID.randomUUID() + ".c";

                                        if (!new File(storeFilePath + "\\" + "bad").exists()) {
                                            new File(storeFilePath + "\\" + "bad").mkdirs();
                                        }
                                        if (!new File(savepath).exists()) { //文件不存在,new一个文件
                                            new File(savepath).createNewFile();
                                        }

                                        int label = 1;
                                        //文件的存储路径.

                                        FileWriter fw = new FileWriter(new File(savepath));//append:true表示追加.
                                        BufferedWriter bw = new BufferedWriter(fw);
                                        List<IASTNode> list_B = new ArrayList<IASTNode>();

                                        // 写入源码内容
                                        bw.write(funContent);
                                        bw.write("\n" + label + "\n");
                                        bw.write("------------------------------------");
                                        bw.flush();
                                    }
                                }
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println(f.getName());
                            continue;
                        }
//                 finally {
//                    //
//
////                    System.out.println(f.getName());
//                    continue; //部分c文件格式有问题导致的错误, 跳过这个文件,继续执行for (File f : fs) { xxx }
//                }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] strings = {"20"};
        for (String s : strings) {
            String type1 = "CWE-" + s;
            String s1 = "E:\\BaiduNetdiskDownload\\CWE\\CWE\\" + type1 + "/" + type1;
            String s2 = "E:\\BaiduNetdiskDownload\\CWE\\CWE\\" + type1 + "/" + type1 + "/" + type1;
            AST_SardGoodBad(s1, s2, 0, 1);
        }
    }
}