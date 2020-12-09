package cdfg;

import cdfg.writer.DigitalWriter;

/**
 * run main
 */
public class Main {
    public static void main(String[] args) {
        int batchsize = 1;
        int batchnum_lastrun = 0;
        /**
         * 以下用于模型训练的数据集处理
         */

//        /**
//         * for acc_train
//         * access 里面的数据函数名没有good/bad,它本身已经分好正负样本了。
//         */
//        String FilePath = "C:\\Users\\86153\\Desktop\\access\\funcblock\\pos_new";
//        String storeFilePath = "C:\\Users\\86153\\Desktop\\access\\good";
//        try {
//            new DigitalWriter2().sard(FilePath, storeFilePath, batchsize, batchnum_lastrun);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        /**
         * for run
         * 来自sard，good/bad用函数名区分。
         */
        String FilePath = "C:\\Users\\86153\\Desktop\\蚂蚁用的三类Java数据集_效果测试的三种数据集\\access_control\\access_source";
        String storeFilePath = "C:\\Users\\86153\\Desktop\\蚂蚁用的三类Java数据集_效果测试的三种数据集\\access_control\\access_out";
        try {
            new DigitalWriter().sard(FilePath, storeFilePath, batchsize, batchnum_lastrun);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * for test
         * 测试。
         */
//        String[] strings = {"001"};
//        for (String s : strings) {
//            String cwe = "CWE-" + s;
//            String base = "case\\";
//            String FilePath = base + cwe;
//            String storeFilePath = base + "\\out";
//
//            try {
//                DigitalWriter.sard(FilePath, storeFilePath, batchsize, batchnum_lastrun);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        /**
         * 以下用于检测，输入对代码块预处理
         */

        /**
         * for acc_train
         * 给一个.java文件，
         */
//        String FilePath = "E:\\java_jdt\\case\\CWE-001";
//        String storeFilePath = "E:\\java_jdt\\case\\out";
//        try {
//            new DigitalWriter3().sard(FilePath, storeFilePath, batchsize, batchnum_lastrun);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}

