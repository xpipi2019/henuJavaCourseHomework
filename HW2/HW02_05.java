import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个年份：");
        int year = sc.nextInt();
        System.out.print("输入一个月份：");
        int m = sc.nextInt();
        int d = 31;
        //1 3 5 7 8 10 12月为默认值31天
        if (m <= 0 || m >= 13){
            System.out.print("输入的月份不合法");
        }//检查月份是否合法
        else if(m == 4 || m == 6 || m == 9 || m == 11){
            d = 30;
        }
        else if(m == 2){
            if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
                d = 29;
            }
            else {
                d = 28;
            }
            //闰年二月判断
        }
        System.out.print("该月的天数为："+d);
    }
}