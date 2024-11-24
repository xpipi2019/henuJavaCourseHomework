import java.io.*;

/**
 * @author XPIPI
 */
public class S7_3 {
    public static void main(String[] args) {
        String sourcePath = "D:\\testExp/AI安全典型攻击与防御.txt";
        String tPath1 = "D:\\testExp/AI安全典型攻击与防御 copy_stream.txt";
        String tPath2 = "D:\\testExp/AI安全典型攻击与防御 copy_RW.txt";
        String tPath3 = "D:\\testExp/AI安全典型攻击与防御 copy_buffered_RW.txt";

        System.out.println("正在使用InputStreamReader、OutputStreamWriter类复制文件...");
        double time1 = copyByStream(sourcePath, tPath1);

        System.out.println("正在使用FileReader、FileWriter类复制文件...");
        double time2 = copyByReaderWriter(sourcePath, tPath2);

        System.out.println("正在使用BufferedReader、BufferedWriter类特殊方法复制文件...");
        double time3 = copyByBufferedReaderWriter(sourcePath, tPath3);

        System.out.println("Done!");

        System.out.println();
        if(time1 < time2 && time1 < time3){
            System.out.println("时间最短的方法是：使用InputStreamReader、OutputStreamWriter类");
        }else if(time2 < time1 && time2 < time3){
            System.out.println("时间最短的方法是：使用FileReader、FileWriter类");
        }else if(time3 < time1 && time3 < time2){
            System.out.println("时间最短的方法是：使用BufferedReader、BufferedWriter类");
        }else{
            System.out.println("效率相同");
        }

    }

    // Stream
    private static double copyByStream(String sourceFile, String destFile) {
        double startTime = System.currentTimeMillis();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(sourceFile));
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile))) {

            int charData;
            while ((charData = isr.read()) != -1) {
                osw.write(charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(sourceFile));
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile))) {

            char[] buffer = new char[1024];
            int charsRead;
            while ((charsRead = isr.read(buffer)) != -1) {
                osw.write(buffer, 0, charsRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    // FileRead+Write
    private static double copyByReaderWriter(String sourceFile, String destFile) {
        double startTime = System.currentTimeMillis();
        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destFile)) {

            int charData;
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destFile)) {

            char[] buffer = new char[1024];
            int charsRead;
            while ((charsRead = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, charsRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    // BufferedReader+Writer
    private static double copyByBufferedReaderWriter(String sourceFile, String destFile) {
        double startTime = System.currentTimeMillis();
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }
}
