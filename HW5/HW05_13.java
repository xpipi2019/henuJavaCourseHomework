import java.util.TreeSet;

/**
 * @author XPIPI
 */
public class HW05_13 {
    public static void main(String[] args) {
        TreeSet<myStudent> students = new TreeSet<>((s1, s2) -> {
            // lambda 自定义排序
            if (s2.score() != s1.score()) {
                return s2.score() - s1.score();
            } else {
                return s1.name().compareTo(s2.name());
            }
        });

        students.add(new myStudent("Alco", 85));
        students.add(new myStudent("Cock", 92));
        students.add(new myStudent("Chal", 70));
        students.add(new myStudent("Apic", 85));
        students.add(new myStudent("Zommi", 95));

        System.out.println("TreeSet 中的 myStudent 对象按成绩降序排列：");
        for (myStudent stu : students) {
            System.out.println(stu);
        }
    }
}

// 记录类
record myStudent(String name, int score) {
    //重写toString
    @Override
    public String toString() {
        return "myStudent { name = " + name + " , score = " + score + " }";
    }
}
