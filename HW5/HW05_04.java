/**
 * @author XPIPI
 */
import java.util.Scanner;

public class HW05_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String input = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse();
        System.out.println("反转后的字符串：" + stringBuffer.toString());

        String[] array = {"Hello", "one", "Days","Ending."};
        String getByString = "";
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组元素[" + (i+1) + "]:" + array[i]);
            getByString += array[i] + " ";
        }

        System.out.println("使用String拼接结果：" + getByString);

        StringBuffer getStringByBuffer = new StringBuffer();
        for (String element : array) {
            getStringByBuffer.append(element).append(" ");
        }
        // element : array 遍历array中元素
        System.out.println("使用StringBuffer拼接结果：" + getStringByBuffer.toString());

        sc.close();
    }
}
