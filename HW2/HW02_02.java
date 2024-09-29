import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW02_02 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("输入一个两位整数: ");
       int input = sc.nextInt();
       while(input != 0) {
           System.out.print(input % 10);
           input /= 10;
       }
   }
}
