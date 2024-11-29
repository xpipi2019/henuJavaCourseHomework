import java.util.Arrays;
import java.io.*;

/**
 * @author XPIPI
 */
public class S7_6 {
    public static void main(String[] args) {
        String inputFilePath = "testExp/s.txt";
        String outputFilePath = "testExp/ss.txt";

        try {
            // 读
            String contentString = readFile(inputFilePath);
            // 排
            String sortedContent = sortString(contentString);
            // 写
            writeFile(outputFilePath, sortedContent);

            System.out.println("Done!");
        } catch (IOException e) {
            System.out.println("操作出错: " + e.getMessage());
        }
    }

    // 读
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }

    // 排
    private static String sortString(String content) {
        char[] charArray = content.toCharArray();
        // 字符数组 基于字典序排序
        Arrays.sort(charArray);
        return new String(charArray);
    }

    // 写
    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
        }
    }
}
