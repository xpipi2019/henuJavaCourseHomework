import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW05_09 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("hello");
        list.add(123);
        list.add(6.9);
        list.add("hello");
        list.add("");
        list.add("Hello");
        StringBuffer s = new StringBuffer("hello");
        list.add(s);
        
        System.out.println("ArrayList中的所有元素：");
        //遍历
        for (Object element : list) {
            System.out.println(element);
        }

        // 查找hello
        ArrayList<Integer> helloIndexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ("hello".equals(list.get(i))) {
                helloIndexes.add(i);
            }
        }

        // 提示输入删除第几个 "hello"
        if (!helloIndexes.isEmpty()) {
            System.out.println("查找到 hello 元素，存在 " + helloIndexes.size() + " 个");
            System.out.print("请输入要删除第几个 hello 元素（1-" + helloIndexes.size() + "）：");
            Scanner sc = new Scanner(System.in);
            int position = sc.nextInt();

            if (position > 0 && position <= helloIndexes.size()) {
                int indexToRemove = helloIndexes.get(position - 1);
                list.remove(indexToRemove);
                System.out.println("已删除指定元素 'hello'");
            } else {
                System.out.println("输入序号不存在。");
            }
            sc.close();
        } else {
            System.out.println("没有查找到元素 hello 。");
        }

        // 将元素 123 替换为 1000
        list.set(list.indexOf(123), 1000);

        System.out.println("ArrayList中的所有元素：");
        //遍历
        for (Object element : list) {
            System.out.println(element);
        }
    }
}

