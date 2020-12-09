package funcblock;

public class Main {
    public static void main(String[] args) {
        //test
//        String oldFilePath = "E:\\IdeaProjects\\sliceJava\\test\\old_file";
//        String newFilePath = "E:\\IdeaProjects\\sliceJava\\test\\new_file";
//        String storeFilePath = "E:\\IdeaProjects\\sliceJava\\test\\out";
//        String changeline = "E:\\IdeaProjects\\sliceJava\\test\\changeline.txt";

        String oldFilePath = "C:\\Users\\86153\\Desktop\\test\\old_files";
        String newFilePath = "C:\\Users\\86153\\Desktop\\test\\new_files";
        String storeFilePath = "C:\\Users\\86153\\Desktop\\out";
        String changeline = "C:\\Users\\86153\\Desktop\\test\\cwe74-new.txt";
        int batchsize = 10;
        int batchnum_lastrun = 0;
        AST_extract ast_extract = new AST_extract();
        ast_extract.AST_GitHub_ChangeLine(oldFilePath,newFilePath,storeFilePath,new FileRead().readFile(changeline),
                batchsize,batchnum_lastrun);
//        ast_extract.AST_Sard_GoodBad(sourceFilePath, storeFilePath,batchnum_lastrun,batchsize);
    }
}
