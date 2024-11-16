import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author XPIPI
 */
public class HW05_10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(20);
        list.add(70);
        list.add(80);

        System.out.println("ArrayList中的元素：");
        for (Integer obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("\n请输入要查找的元素：");
        int elementTarget = sc.nextInt();

        //iterator查找并删除重复元素
        boolean found = false;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int currentElement = iterator.next();
            if (currentElement == elementTarget) {
                found = true;
                iterator.remove();
            }
        }

        if (found) {
            System.out.println("元素 " + elementTarget + " 已找到并删除所有重复项。");
        } else {
            System.out.println("元素 " + elementTarget + " 未找到。");
        }

        System.out.println("ArrayList中的元素：");
        for (Integer obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();

        sc.close();
    }
}
