package slice;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

/**
 * The AST_extract class processes c language source code files
 */
public class AST_extract {

    public void AST_SardGoodBad(String sourceFilePath, String storeFilePath, int batchnum_lastrun, int batchsize) {
        //store file path
        if (!new File(storeFilePath).exists()) {
            new File(storeFilePath).mkdirs();
        }

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
                            //main
                            IASTDeclaration[] decls = translationUnit.getDeclarations();

                            for (IASTDeclaration decl : decls) {
                                if (decl instanceof CPPASTFunctionDefinition) {
                                    String funcName = decl.getRawSignature().split("\n")[0].replaceAll("\r", "")
                                            .replaceAll("\n", "");
                                    Pattern good = Pattern.compile(".*[Gg][Oo][Oo][Dd].*");
                                    Pattern bad = Pattern.compile(".*[Bb][Aa][Dd].*");

                                    if ((good.matcher(funcName).matches()) && (!bad.matcher(funcName).matches())) {
                                        String savepath = storeFilePath + "\\" + "good" + "\\" + UUID.randomUUID() + ".c";
                                        if (!new File(storeFilePath + "\\" + "good").exists()) {
                                            new File(storeFilePath + "\\" + "good").mkdirs();
                                        }
                                        if (!new File(savepath).exists()) {
                                            new File(savepath).createNewFile();
                                        }
                                        int label = 0;
                                        WriteToFile.sourceCode(decl, savepath);
                                    }


                                    if ((bad.matcher(funcName).matches()) && (!good.matcher(funcName).matches())) {
                                        String savepath = storeFilePath + "\\" + "bad" + "\\" + UUID.randomUUID() + ".c";

                                        if (!new File(storeFilePath + "\\" + "bad").exists()) {
                                            new File(storeFilePath + "\\" + "bad").mkdirs();
                                        }
                                        if (!new File(savepath).exists()) {
                                            new File(savepath).createNewFile();
                                        }
                                        int label = 1;
                                        WriteToFile.sourceCode(decl, savepath);
                                    }
                                }
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println(f.getName());
                            continue;
                        }
                    }
                }
            }
        }
    }
}

