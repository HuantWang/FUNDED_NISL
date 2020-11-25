package test;

import org.eclipse.cdt.core.dom.ast.*;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;

import java.io.File;
import java.util.*;

public class test {

    public static void main(String[] args) throws Exception {
        String sourceFilePath = "docs/test";
        File file = new File(sourceFilePath);
        File[] fs = file.listFiles();    //遍历path下的文件和目录，放在File数组中
        File f = null;
        if (fs != null) {
            f = fs[0];
        }
        //遍历得到count,方便查看处理速度

        FileContent fileContent = FileContent.createForExternalFileLocation(f.toString());
        Map definedSymbols = new HashMap();//哈希表，定义符号
        String[] includePaths = new String[0];
        IScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
        IParserLogService log = new DefaultLogService();
        IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();
        int opts = 8;
        IASTTranslationUnit translationUnit = GPPLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);

        //FunctionDeclaration
        IASTDeclaration[] declarations = translationUnit.getDeclarations();
        for (IASTDeclaration decl : declarations) {
            if (decl instanceof CPPASTFunctionDefinition) {
                testVisitor visitor1 = new testVisitor();
                decl.accept(visitor1);
                Object o1 = visitor1.getChildren();
                Object o2 = visitor1.getNextToken();
                Object o3 = visitor1.getComputedFrom();
                System.out.println("---test---");
            }
        }
    }
}