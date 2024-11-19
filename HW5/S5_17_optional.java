import java.util.ArrayList;
import java.util.List;

/**
 * @author XPIPI
 * 约瑟夫问题详解：<a href="https://blog.csdn.net/weixin_44572229/article/details/119108676">...</a>
 */

public class S5_17_optional {
    public static void main(String[] args) {
        int peopleCount = 500;
        int countTo = 3;

        List<Integer> people = new ArrayList<>();
        for (int i = 0; i < peopleCount; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + countTo - 1) % people.size();
            people.remove(index);
        }

        /* 方法二 队列Deque
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < peopleCount; i++) {
            deque.add(i);
        }

        int count = 0;
        while (deque.size() > 1) {
            //每次取出队首
            int person = deque.pollFirst();
            count++;

            // 不是3的倍数放回队尾
            if (count % countTo != 0) {
                deque.addLast(person);
            }
        }
        */

        System.out.println("最后剩下的人在原来的位置: " + people.get(0));
    }
}
