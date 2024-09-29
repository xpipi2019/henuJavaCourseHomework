import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生个数: ");
        int nums = sc.nextInt();
        double[] grades = new double[nums];
        String[] names = new String[nums];

        for(int i = 0;i < nums;i++){
            System.out.println("请输入第 " + (i+1) + " 个学生的名字和成绩：");
            names[i] = sc.next();
            grades[i] = sc.nextDouble();
        }
        sortWithName(grades, names);

        System.out.println("第一名 名字："+names[0]+" 成绩："+grades[0]);
        System.out.println("第二名 名字："+names[1]+" 成绩："+grades[1]);
    }

    static void sortWithName(double[] datas, String[] tags) {
        for(int i = 0;i < datas.length - 1;i++){
            for(int j = 0;j < datas.length - i - 1;j++){
                if(datas[j] < datas[j+1]){
                    double dataTmp = datas[j];
                    String tagTmp = tags[j];
                    datas[j] = datas[j+1];
                    datas[j+1] = dataTmp;
                    tags[j] = tags[j+1];
                    tags[j+1] = tagTmp;
                }
            }
        }
        //冒泡sort
    }
}