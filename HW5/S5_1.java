/**
 * @author XPIPI
 * Thanks : https://blog.csdn.net/zhou_kapenter/article/details/62890262
 */
import java.util.Base64;
import java.util.Scanner;
public class S5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("明文：");
        String originalText = sc.nextLine();
        System.out.println("*******************");

        System.out.println("加密方法：Base64");
        System.out.println("*******************");

        String encodedText = encodeBase64(originalText);
        System.out.println("Base64编码后的字符串：" + encodedText);
        System.out.println("*******************");
        String decodedText = decodeBase64(encodedText);
        System.out.println("解码后的字符串：" + decodedText);
        System.out.println("*******************");

        sc.close();
    }


    public static String encodeBase64(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    public static String decodeBase64(String encodedText) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedText);
        return new String(decodedBytes);
    }
}
