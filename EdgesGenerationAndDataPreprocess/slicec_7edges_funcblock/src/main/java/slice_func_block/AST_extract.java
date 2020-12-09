package slice_func_block;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

/**
 * AST_extract类处理c语言源码文件,得到1,2,3三种关系,以及源码文件及标记.
 */
public class AST_extract {

    /**
     * 处理good/bad这种来自sard中的数据
     */
    public void AST_SardGoodBad(String sourceFilePath, String storeFilePath, int batchnum_lastrun, int batchsize) {
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

                                    if ((good.matcher(funcName).matches()) && (!bad.matcher(funcName).matches())) {


                                        //文件的存储路径.
                                        String savepath = storeFilePath + "\\" + "good" + "\\" + UUID.randomUUID() + ".txt";
                                        if (!new File(storeFilePath + "\\" + "good").exists()) {
                                            new File(storeFilePath + "\\" + "good").mkdirs();
                                        }
                                        if (!new File(savepath).exists()) { //文件不存在,new一个文件
                                            new File(savepath).createNewFile();
                                        }
                                        int label = 0;
                                        WriteToFile.sourceCodeAndNode(decl, savepath, label);
                                    }


                                    if ((bad.matcher(funcName).matches()) && (!good.matcher(funcName).matches())) {
                                        //文件的存储路径.
                                        String savepath = storeFilePath + "\\" + "bad" + "\\" + UUID.randomUUID() + ".txt";

                                        if (!new File(storeFilePath + "\\" + "bad").exists()) {
                                            new File(storeFilePath + "\\" + "bad").mkdirs();
                                        }
                                        if (!new File(savepath).exists()) { //文件不存在,new一个文件
                                            new File(savepath).createNewFile();
                                        }
                                        int label = 1;
                                        WriteToFile.sourceCodeAndNode(decl, savepath, label);
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


    /**
     * @param sourceFilePath   ?
     * @param storeFilePath    ?
     * @param mapold           ?
     * @param mapnew           ?
     * @param batchnum_lastrun ?
     * @param batchsize        ?
     * @desciption old,new各自与changeline的对应部分
     */
    public void AST_oldnewChangeline(String sourceFilePath, String
            storeFilePath, Map<String, List<String>> mapold, Map<String, List<String>> mapnew, int batchnum_lastrun, int batchsize) {

        if (!new File(storeFilePath).exists()) {
            new File(storeFilePath).mkdirs();
        }

        File file = new File(sourceFilePath);
        File[] fs = file.listFiles();    //遍历path下的文件和目录，放在File数组中
        if (fs != null) {
            //遍历得到count,方便查看处理速度
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
                    try {
                        //读入内容
                        FileContent fileContent = FileContent.createForExternalFileLocation(f.toString());
                        Map<String, String> definedSymbols = new HashMap();//哈希表，定义符号
                        String[] includePaths = new String[0];
                        IScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
                        IParserLogService log = new DefaultLogService();
                        IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();

                        int opts = 8;
                        IASTTranslationUnit translationUnit = GPPLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);
//                        System.out.println(translationUnit.getASTFileSet());
                        //用于和map中的key对比.
                        String fileName = f.getName().split(".txt")[0];

                        if (!f.isDirectory()) {

                            //主体内容
                            IASTDeclaration[] decls = translationUnit.getDeclarations();
                            //切分好后的每一个函数块
                            for (IASTDeclaration decl : decls) {
                                int begin = decl.getFileLocation().getStartingLineNumber();
                                int end = decl.getFileLocation().getEndingLineNumber();

                                if (mapold.containsKey(fileName)) {
                                    String savePath = "";
                                    if ((!sourceFilePath.contains("old_files")) && (!sourceFilePath.contains("new_files"))) {
                                        System.out.println("path has problems if not testing!");
                                    }
                                    //oldfiles的为Bug,标记1
                                    if (sourceFilePath.contains("old_files")) {

                                        savePath = storeFilePath + "\\oldBlock\\";
                                        if (!new File(storeFilePath + "\\oldBlock\\").exists()) { //文件不存在,new一个文件
                                            new File(storeFilePath + "\\oldBlock\\").mkdirs();
                                        }

                                        //SourceCodeAndNode.WriteToFile只负责写入,需要提供代码块、存储路径、label三个参数
                                        //arrayList中存放当前文件的修改行号
                                        Iterator iterator = ((ArrayList<String>) mapold.get(fileName)).iterator();
                                        while (iterator.hasNext()) {
                                            int temp = Integer.valueOf((String) (iterator.next()));
                                            if (temp >= begin && temp <= end) {
                                                String savePathFinal = savePath + UUID.randomUUID() + ".txt";
                                                //SourceCodeAndNode.WriteToFile只负责写入,需要提供代码块、存储路径、label三个参数
                                                WriteToFile.sourceCodeAndNode(decl, savePathFinal,1);

                                                //如果当前代码块已经在能对应到行号,就没必要继续遍历changeline了.直接跳到下一个代码块
                                                break;
                                            }
                                        }

                                    }
                                }
                                //newfiles的为nobug,标记0
                                if (mapnew.containsKey(fileName)) {
                                    if (sourceFilePath.contains("new_files")) {

                                        String savePath = storeFilePath + "\\newBlock\\";
                                        if (!new File(storeFilePath + "\\newBlock\\").exists()) { //文件不存在,new一个文件
                                            new File(storeFilePath + "\\newBlock\\").mkdirs();
                                        }

                                        //将list中的值和begin,end比较,介于其中则label=1,同时退出循环.否则为0
                                        Iterator iterator = ((ArrayList<String>) mapnew.get(fileName)).iterator();
                                        while (iterator.hasNext()) {
                                            int temp = Integer.valueOf((String) (iterator.next()));
                                            if (temp >= begin && temp <= end) {
                                                String savePathFinal = savePath + UUID.randomUUID() + ".txt";
                                                //SourceCodeAndNode.WriteToFile只负责写入,需要提供代码块、存储路径、label三个参数
                                               WriteToFile.sourceCodeAndNode(decl, savePathFinal,0);
                                                //如果当前代码块已经在能对应到行号,就没必要继续遍历changeline了.直接跳到下一个代码块
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(f.getName());
                    } finally {
                        //
//                    System.out.println(f.getName());
                        continue; //部分c文件格式有问题导致的错误, 跳过这个文件,继续执行for (File f : fs) { xxx }
                    }
                }
            }
        } else {
            System.out.println("sourceFilePath is null!");
        }
    }


}


