/**
 * @author XPIPI
 */
import java.util.Scanner;

public class HW05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入字符串：");
        String input = sc.nextLine();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // charAt() 返回当前字符
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("大写字母个数：" + upperCaseCount);
        System.out.println("小写字母个数：" + lowerCaseCount);
        System.out.println("数字个数：" + digitCount);
        System.out.println("其他字符个数：" + otherCount);
    }
}
