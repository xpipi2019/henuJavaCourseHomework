import java.util.Scanner;

/**
 * @author XPIPI
 */
class myMax {
    static int findMax(int x,int y){
        return x>y?x:y;
    }
    static double findMax(double x,double y){
        return x>y?x:y;
    }
    static double findMax(double x,double y,double z){
        return (x>y ? x:y) > z ? (x>y ? x:y):z;
    }
}

public class HW02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入两个整数：");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("最大值为："+myMax.findMax(x1,y1));

        System.out.println("输入两个小数：");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("最大值为："+myMax.findMax(x2,y2));

        System.out.println("输入三个小数：");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double z3 = sc.nextDouble();
        System.out.println("最大值为："+myMax.findMax(x3,y3,z3));

        sc.close();
    }
}