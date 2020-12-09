package sevenEdges;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {
        String path = "E:\\eclipse-cdt-standalone-astparser-master\\docs\\DeviceManager.h";
        FileContent fileContent = FileContent.createForExternalFileLocation(path);
        Map definedSymbols = new HashMap();
        String[] includePaths = new String[0];
        IScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
        IParserLogService log = new DefaultLogService();
        IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();
        int opts = 8;

        // public static GPPLanguage getDefault() {
        //        return DEFAULT_INSTANCE;
        //    }
        //private static final GPPLanguage DEFAULT_INSTANCE = new GPPLanguage();

        IASTTranslationUnit translationUnit = GPPLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);
        IASTDeclaration[] declarations = translationUnit.getDeclarations();
        for (IASTDeclaration declaration : declarations) {
            if (declaration instanceof CPPASTFunctionDefinition) {
                System.out.println(((CPPASTFunctionDefinition) declaration).getScope());
                System.out.println("\n--------");
            }
        }

    }
}