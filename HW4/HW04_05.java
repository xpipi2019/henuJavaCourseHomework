/**
 * @author XPIPI
 */
class Employee2 {
    private String name;
    private int age;
    private String id;
    private double salary;
    private int gongling;
    
    public Employee2(String name, int age, String id, double salary, int gongling) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.gongling = gongling;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary() {
        salary *= 1.1;
    }

    public void displayInfo() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("工号: " + id);
        System.out.println("工资: " + (int)salary);
        System.out.println("工龄: " + gongling);
        System.out.println();
    }
}

class Manager extends Employee2 {
    public Manager(String name, int age, String id, double salary, int gongling) {
        super(name, age, id, salary, gongling);
    }

    @Override
    public void raiseSalary() {
        super.raiseSalary();
        super.raiseSalary();
    }
}

public class HW04_05 {
    public static void main(String[] args) {
        Employee2 Employee001 = new Employee2("Alice", 25, "E001", 5000, 3);
        Employee2 Employee002 = new Manager("Bob", 35, "M001", 10000, 10);
        // 多态 向上转换
        //Manager manager = (Manager) Employee002;

        Employee001.displayInfo();
        Employee002.displayInfo();
        Employee001.raiseSalary();
        Employee002.raiseSalary();

        System.out.println("涨薪后:");
        Employee001.displayInfo();
        Employee002.displayInfo();
    }
}
