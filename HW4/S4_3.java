/**
 * @author XPIPI
 */
import java.util.Random;

class Member {
    private String name;
    private final int HF = 1500;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHF() {
        return HF;
    }

    public void payHF() {
        System.out.println(name + " 支付会费 " + HF + " 元。");
    }
}

interface Staff {
    int generateSalary();
}
// 工作人员接口

class PartTimeStaff extends Member implements Staff {
    private int salary;

    public PartTimeStaff(String name) {
        super(name);
        this.salary = generateSalary();
    }

    @Override
    public int generateSalary() {
        Random rand = new Random();
        return 1000 + rand.nextInt(2001);
    }

    public void calculateNetIncome() {
        int income = salary - getHF();
        System.out.println("获得薪酬：" + income + "元");
        if (income < 0) {
            System.out.println("工资不足以支付会费，加油干吧！");
        }
    }
}

public class S4_3 {
    public static void main(String[] args) {
        PartTimeStaff partTimeStaff = new PartTimeStaff("STAFF A");

        partTimeStaff.payHF();
        partTimeStaff.calculateNetIncome();
    }
}
