package slice_func_block;

public class Main{
    public static void main(String[] args) {
        String changeLineOld = "F:\\data\\raw_file\\txt\\changeline_cwe-191_old.txt"; //changeline的存放地址
        String changeLineNew = "F:\\data\\raw_file\\txt\\changeline_cwe-191_new.txt"; //changeline的存放地址
        String sourceFilePath = "F:\\data\\raw_file\\old_files"; //源文件地址
        String storeFilePath = "F:\\data\\raw_file\\output";  //输出结果的地址,output不应在源文件路径下,会被再次遍历.

        AST_extract ast_extract = new AST_extract();

        int batchsize = 1;  //一次处理文件的块大小
        int batchnum_lastrun = 0; // 当前处理的块

        ast_extract.AST_oldnewChangeline(sourceFilePath, storeFilePath,new FileRead().readFile(changeLineOld),new FileRead().readFile(changeLineNew),batchnum_lastrun, batchsize);
//                ast_extract.AST_SardGoodBad(sourceFilePath, storeFilePath,batchnum_lastrun,batchsize);
    }
}
