import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名: ");
        String user = sc.nextLine();

        while(checkInput(user,3)){
            System.out.println("用户名必须至少为3位，请重新输入！");
            user = sc.nextLine();
        }

        boolean t = true;
        String password,password2;

        while(t){
            System.out.println("请输入密码: ");
            password = sc.nextLine();
            while(checkInput(password,6)){
                System.out.println("密码必须至少为6位，请重新输入！");
                password = sc.nextLine();
            }
            System.out.println("请确认密码: ");
            password2 = sc.nextLine();
            if(password.equals(password2)){
                t = false;
                System.out.println("用户名"+user+" 密码"+password2);
            }
            else {
                System.out.println("两次输入密码不一致，请重新输入！");
            }
        }
        //密码条件检查
        sc.close();
    }

    static boolean checkInput(String input,int minLength) {
        return input.length() < minLength;
    }
    //检查输入是否满足最小长度
}
