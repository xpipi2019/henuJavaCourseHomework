import java.util.Scanner;

/**
 * @author XPIPI
 */
public class S2_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入若干数，每输入一个数回车确认\n最后输入数字0结束输入操作");
        float input,sum = 0;

        for(int i = 0;i < 15;i++){
            input = sc.nextInt();
            if(input == 0){
                break;
            }
            else{
                sum += input;
            }
        }

        System.out.println("sum=" + sum);

        sc.close();
    }
}