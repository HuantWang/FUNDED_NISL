package swift3.main;

import java.io.File;

public class FileMove {
    public static void main(String[] args) {

        int count = 0;
        File startFile = new File("E:\\CCS_DATA\\swift\\buffer\\buffer\\old_files");

        for (File f : startFile.listFiles()) {

            File endDirection = new File("E:\\CCS_DATA\\swift\\buffer\\buffer\\old_files" + count);
            if (!endDirection.exists()) {
                endDirection.mkdirs();
            }

            File endFile = new File(endDirection + File.separator + f.getName());
            try {
                if (f.renameTo(endFile)) {
                    System.out.println("文件移动成功！目标路径：{" + endFile.getAbsolutePath() + "}");
                    count++;
                } else {
                    System.out.println("文件移动失败！起始路径：{" + startFile.getAbsolutePath() + "}");
                }
            } catch (Exception e) {
                System.out.println("文件移动出现异常！起始路径：{" + startFile.getAbsolutePath() + "}");
            }

        }
    }
}
