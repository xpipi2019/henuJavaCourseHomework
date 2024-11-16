import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getRndNumber();
        int num2 = getRndNumber();
        String solve = "+";

        int res = num1 + num2;
        if(Math.random() > 0.35 && num1 > num2){
        solve = "-";
        res = num1 - num2;
        }
        //随机加减

        System.out.println("请输入答案");
        System.out.print(num1 + solve + num2 +"=");

        int ans = sc.nextInt();
        if(ans == res){
            System.out.print("答案正确！");
        }
        else{
            System.out.print("答案错误！");
        }

        sc.close();
    }

    static int getRndNumber(){
        return (int)(Math.random()*90+10);
    }
    //10~99
}