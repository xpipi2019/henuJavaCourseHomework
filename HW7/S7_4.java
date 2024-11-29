import java.io.*;
import java.util.*;

/**
 * @author XPIPI
 */
public class S7_4 {
    public static void main(String[] args) {
        String testFile = "test.txt";
        String stuFile = "students.txt";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("请输入内容需要写入的内容，输入 'exit' 结束:");
            writeAndReadFile(sc, testFile);

            System.out.println();

            System.out.println("请输入5个学生的姓名和成绩:");
            writeStudentInfo(sc, stuFile);

        } catch (IOException e) {
            System.out.println("操作出错: " + e.getMessage());
        }
    }

    private static void writeAndReadFile(Scanner sc, String testFile) throws IOException {
        //打开文件写入流
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            String line;
            while (!(line = sc.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();
            }
        }
        System.out.println();
        System.out.println("文件内容如下:");
        try (BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    private static void writeStudentInfo(Scanner sc, String stuFile) throws IOException {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("请输入学生 " + (i+1) + " 姓名: ");
            String name = sc.nextLine();
            System.out.print("请输入学生 " + (i+1) + " 成绩: ");
            double score = sc.nextDouble();
            sc.nextLine();
            // 一定要清除换行符
            students.add(new Student(name, score));
        }

        students.sort(Comparator.comparingDouble(Student::getScore).reversed());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(stuFile))) {
            writer.write("学生信息:");
            writer.newLine();
            for (Student student : students) {
                writer.write(student.getName() + ", " + student.getScore());
                writer.newLine();
            }
        }

        System.out.println("Done!");
    }

    static class Student {
        private final String name;
        private final double score;

        public Student(String name, double score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public double getScore() {
            return score;
        }
    }
}
