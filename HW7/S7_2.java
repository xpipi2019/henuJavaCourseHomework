import java.io.*;

/**
 * @author XPIPI
 */
public class S7_2 {
    public static void main(String[] args) {
        // 输入文件路径和输出文件路径（根据实际情况修改）
        String sourceFilePath = "D:\\testExp/ヨルシカ - 言って。.mp3";
        String copyByBytePath = "D:\\testExp/ヨルシカ - 言って。 copy_byte_stream.mp3";
        String copyByBufferPath = "D:\\testExp/ヨルシカ - 言って。 copy_buffered_stream.mp3";
        
        System.out.println("正在使用字节流复制文件...");
        double timeByteStream = copyUsingByteStream(sourceFilePath, copyByBytePath);
        System.out.println("字节流复制完成，Time: " + timeByteStream + " ms");

        System.out.println("正在使用字节缓冲流复制文件...");
        double timeBufferedStream = copyUsingBufferedStream(sourceFilePath, copyByBufferPath);
        System.out.println("字节缓冲流复制完成，Time: " + timeBufferedStream + " ms");

        System.out.println();
        if (timeByteStream > timeBufferedStream) {
            System.out.println("字节缓冲流效率更高，快了 " + (timeByteStream - timeBufferedStream) + " ms");
        } else if (timeByteStream < timeBufferedStream) {
            System.out.println("字节流效率更高，快了 " + (timeBufferedStream - timeByteStream) + " ms");
        } else {
            System.out.println("两种方式耗时相同。");
        }
    }

    // Byte Stream
    private static double copyUsingByteStream(String sourceFile, String targetFile) {
        double startTime = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException ignored) {}
        return System.currentTimeMillis() - startTime;
    }

    // Buffered stream
    private static double copyUsingBufferedStream(String sourceFile, String targetFile) {
        double startTime = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException ignored) {}
        return System.currentTimeMillis() - startTime;
    }
}
