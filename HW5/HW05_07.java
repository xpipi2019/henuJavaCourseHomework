/**
 * @author XPIPI
 */
import java.util.Scanner;

public class HW05_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份: ");
        int year = sc.nextInt();

        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        if (isLeap) {
            System.out.println("该年二月份有29天");
        }
        else {
            System.out.println("该年二月份有28天");
        }
    }
}
