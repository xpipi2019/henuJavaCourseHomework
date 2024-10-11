/**
 * @author XPIPI
 */
class Account {
    private String accountID;
    private String accountMaster;
    private double money;
    private String password;

    public Account(String accountID, String accountMaster, double money, String password) {
        this.accountID = accountID;
        this.accountMaster = accountMaster;
        this.money = money;
        this.password = password;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getaccountMaster() {
        return accountMaster;
    }

    public double getmoney() {
        return money;
    }

    public boolean checkPassword(String input) {
        return this.password.equals(input);
    }

    public void checkIn(double deposit) {
        money += deposit;
        System.out.println("成功存入：" + deposit + "元。当前余额：" + money + "元。");
    }

    public void checkOut(double withdraw) {
        if (withdraw <= money) {
            money -= withdraw;
            System.out.println("成功取出：" + withdraw + "元。当前余额：" + money + "元。");
        } else {
            System.out.println("余额不足。");
        }
    }
}

class ATM {
    private Account[] accounts;
    private Account loggedInAccount = null;
    public ATM(Account[] accounts) {
        this.accounts = accounts;
    }

    public boolean login(String accountID, String password) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountID().equals(accountID) && accounts[i].checkPassword(password)) {
                loggedInAccount = accounts[i];
                System.out.println("Welcome," + loggedInAccount.getaccountMaster() + "!");
                return true;
            }
        }
        System.out.println("账号或密码错误，登录失败。");
        return false;
    }

    public void checkIn(double deposit) {
        if (loggedInAccount != null) {
            loggedInAccount.checkIn(deposit);
        } else {
            System.out.println("请先登录账户。");
        }
    }

    public void checkOut(double withdraw) {
        if (loggedInAccount != null) {
            loggedInAccount.checkOut(withdraw);
        } else {
            System.out.println("请先登录账户。");
        }
    }

    public void logout() {
        if (loggedInAccount != null) {
            System.out.println("已退出账户：" + loggedInAccount.getaccountMaster());
            loggedInAccount = null;
        } else {
            System.out.println("没有账户登录。");
        }
    }
}

public class HW03_06 {
    public static void main(String[] args) {
        Account account0 = new Account("admin", "admin", 999999.9, "admin");
        Account account1 = new Account("zhangsan", "张三", 3333.3, "123456");
        Account account2 = new Account("ls666", "李四", 666.6, "qaz123");
        Account[] accounts = {account0,account1, account2};
        ATM atm = new ATM(accounts);

        atm.login("zhangsan", "12345");
        atm.login("zhangsan123", "123456");
        atm.login("zhangsan", "123456");
        atm.checkIn(1000.0);
        atm.checkOut(5000.0);
        atm.checkOut(2000.0);
        atm.logout();

        atm.login("ls666", "qaz123");
        atm.logout();

        atm.login("ls666", "qaz123");
        atm.checkOut(666.6);
        atm.logout();
    }
}
