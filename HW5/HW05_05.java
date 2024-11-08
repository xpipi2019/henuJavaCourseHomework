/**
 * @author XPIPI
 */
import java.util.Random;
import java.util.Scanner;

public class HW05_05 {
    public static void main(String[] args) {
        String code = getCode(6);
        System.out.println("验证码：" + code);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入验证码：");
        String userInput = scanner.nextLine();

        if (code.equalsIgnoreCase(userInput)) {
            System.out.println("恭喜验证成功！");
        } else {
            System.out.println("验证失败！");
        }
    }

    public static String getCode(final int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer code = new StringBuffer();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            code.append(chars.charAt(index));
        }

        return code.toString();
    }
}
