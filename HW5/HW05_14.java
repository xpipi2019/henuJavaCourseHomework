import java.util.*;

/**
 * @author XPIPI
 */

public class HW05_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> ciMap = new HashMap<>();

        System.out.println("请输入整数（当输入为0时，表示结束输入）：");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            ciMap.put(number, ciMap.getOrDefault(number, 0) + 1);
        }

        int maxCi = 0;
        List<Integer> maxCiNums = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : ciMap.entrySet()) {
            int ci = entry.getValue();
            if (ci > maxCi) {
                maxCi = ci;
                maxCiNums.clear();
                maxCiNums.add(entry.getKey());
            } else if (ci == maxCi) {
                maxCiNums.add(entry.getKey());
            }
        }
        /* 一个更简单的方法
        * int maxCi = ciMap.values().stream().max(Integer::compare).orElse(0);
            List<Integer> maxCiNums = ciMap.entrySet().stream()
            .filter(entry -> entry.getValue() == maxCi)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        * */

            System.out.println("出现频率最高的数字及其频率：");
            for (int num : maxCiNums) {
                System.out.println(num + " " + maxCi);
            }
    }
}
