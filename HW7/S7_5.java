import java.io.*;
import java.util.Scanner;

/**
 * @author XPIPI
 */
public class S7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入指定路径: ");
        String sourceDirPath = sc.nextLine();

        String targetDirPath = "testExp/targetDir";

        System.out.println("输入指定文件类型: ");
        String fileExtension = "." + sc.next().toLowerCase();

        File targetDir = new File(targetDirPath);
        copyFilesByType(new File(sourceDirPath), targetDir, fileExtension);

        System.out.println("Done!");
    }


    public static void copyFilesByType(File sourceDir, File targetDir, String fileExtension) {
        // 遍历源目录中文件
        File[] files = sourceDir.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(fileExtension)) {
                copyFile(file, new File(targetDir, file.getName()));
            }
        }
    }

    public static void copyFile(File sourceFile, File targetFile) {
        try (InputStream is = new FileInputStream(sourceFile);
             OutputStream os = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("文件复制失败: " + sourceFile.getAbsolutePath());
            e.printStackTrace();
        }
    }
}
