/**
 * @author XPIPI
 */
import java.io.IOException;
import java.util.Scanner;

public class HW05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password, confirmPassword, phoneNumber;
        boolean regStatus = false;

        while (!regStatus) {
            System.out.print("请输入用户名：");
            username = sc.nextLine();

            System.out.print("请输入密码：");
            password = sc.nextLine();
            System.out.print("请再次输入密码：");
            confirmPassword = sc.nextLine();
            if (password.equals(confirmPassword)) {
                regStatus = true;
            } else {
                System.out.println("密码不一致，请重新注册！");
                continue;
            }

            System.out.print("请输入手机号码：");
            phoneNumber = sc.nextLine();

            System.out.println("注册成功！");
            login(sc, username, password);
        }
    }

    public static void login(Scanner sc, String registeredUsername, String registeredPassword) {
        int nowAttempts = 0;
        final int maxAttempts = 3;
        boolean loginSuccessful = false;

        while (nowAttempts < maxAttempts && !loginSuccessful) {
            System.out.print("请输入用户名：");
            String inputUsername = sc.nextLine();

            System.out.print("请输入密码：");
            String inputPassword = sc.nextLine();

            if (inputUsername.equals(registeredUsername) && inputPassword.equalsIgnoreCase(registeredPassword)) {
                System.out.println("登录成功！");
                openCalc();
                loginSuccessful = true;
            } else {
                nowAttempts++;
                if (nowAttempts < maxAttempts) {
                    System.out.println("密码错误，请重新输入！");
                } else {
                    System.out.println("登录失败，无法再继续登录。");
                }
            }
        }
    }

    public static void openCalc() {
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            System.out.println("无法打开计算器。");
        }
    }
}
