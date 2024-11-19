/**
 * @author XPIPI
 * 捕获异常方法：https://ask.csdn.net/questions/7457307
 */
import java.util.Scanner;

// 自定义异常类
class ErrorTriangleException extends Exception {
    public ErrorTriangleException(String message) {
        super(message);
    }
}

public class S6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("请输入三角形的三条边长: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            checkTriangle(a, b, c);

            double area = calculateArea(a, b, c);
            System.out.println("三角形的面积为: " + area);

        } catch (ErrorTriangleException e) {
            System.out.println("错误: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("数学错误: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    //计算三角形面积时捕获运行异常
    private static double calculateArea(double a, double b, double c) throws ArithmeticException {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static void checkTriangle(double a, double b, double c) throws ErrorTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new ErrorTriangleException("三条边无法组成一个有效的三角形");
        }
    }
}
