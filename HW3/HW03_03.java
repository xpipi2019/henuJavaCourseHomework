/**
 * @author XPIPI
 */
class Employee {
    private int id;
    private String name;
    private int age;
    private String position;
    private String department;
    private static int attendanceCount = 0;

    public Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
        this.position = "Unknown";
        this.department = "Unknown";
    }

    public Employee(int id, String name, int age, String position, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    public void signIn() {
        attendanceCount++;
        System.out.println(this.name + " 已经签到，当前共有 " + attendanceCount + " 人已签到。");
    }

    public void displayInfo() {
        System.out.println("编号: " + id);
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("职务: " + position);
        System.out.println("部门: " + department);
    }

    public static int getAttendanceCount() {
        return attendanceCount;
    }
}

public class HW03_03 {
    //public class TestEmployee {}
    public static void main(String[] args) {
        Employee employee0 = new Employee();
        Employee employee1 = new Employee(1, "张三", 30, "OP", "xx部");
        Employee employee2 = new Employee(2, "李四", 28, "EE", "yy部");

        employee1.signIn();
        employee2.signIn();

        System.out.println("Employee 0:");
        employee0.displayInfo();
        System.out.println("Employee 1:");
        employee1.displayInfo();
        System.out.println("Employee 2:");
        employee2.displayInfo();

        System.out.println("\n当前出勤人数: " + Employee.getAttendanceCount());
    }
}
