import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author XPIPI
 */
public class S5_11 {
    static Random random = new Random();

    public static void createRandomArray(int nums) {
        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < nums) {
            int number = 350 + random.nextInt(101);
            // 350~450
            if (!list.contains(number)) {
                list.add(number);
            }
        }

        System.out.println("使用 ArrayList 生成的 " + nums + " 个不重复的随机整数：");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void createRandomSet(int nums) {
        Set<Integer> set = new HashSet<>();

        while (set.size() < 10) {
            int number = 350 + random.nextInt(101);
            set.add(number);
            //set可以自动去重
        }

        System.out.println("使用 Set 生成的 10 个不重复的随机整数：");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        createRandomArray(10);
        createRandomSet(10);
    }
}
