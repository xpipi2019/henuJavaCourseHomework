import java.io.File;
import java.util.Scanner;

/**
 * @author XPIPI
 */
public class S7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个D盘下目录名称: ");
        String path = "D:\\" + sc.nextLine();

        listExeFiles(path);
    }
    
    public static void listExeFiles(String path) {
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("这个目录不存在: " + path);
            return;
        }

        File[] files = directory.listFiles();

        boolean foundExeFile = false;
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".exe")) {
                    System.out.println("找到的.exe文件: " + file.getName());
                    foundExeFile = true;
                }
            }
            if (!foundExeFile) {
                System.out.println("未找到任何后缀为.exe的文件。");
            }
        }
    }
}
