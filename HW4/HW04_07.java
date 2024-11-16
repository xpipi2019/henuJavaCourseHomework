/**
 * @author XPIPI
 */
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class ExceptionHandler {
    public void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("输入不能是负数！");
        } else {
            System.out.println("输入值为: " + value);
        }
    }
}

public class HW04_07 {
    public static void main(String[] args) {
        ExceptionHandler handler = new ExceptionHandler();
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i < 3;i++){
            int input = sc.nextInt();
            try {
                handler.checkValue(input);
            } catch (CustomException e) {
                System.out.println("错误: " + e.getMessage());
            }
        }

        sc.close();
        }
}
