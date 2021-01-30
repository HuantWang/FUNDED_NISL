package slice;

public class Main{
    public static void main(String[] args) {

        String sourceFilePath = "demo\\0source";
        String storeFilePath = "demo\\1slice";

        slice.AST_extract ast_extract = new slice.AST_extract();

        int batchsize = 10;
        int batchnum_lastrun = 0;

        //sard_good_bad
        ast_extract.AST_SardGoodBad(sourceFilePath, storeFilePath,batchnum_lastrun,batchsize);
    }
}
