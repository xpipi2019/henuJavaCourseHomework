import java.util.*;

/**
 * @author XPIPI
 */

public class S5_16_optional {
    public static void main(String[] args) {
        String example = "Today, We have a class of java, as we kown, java is an object oriented  programming language, and java is fun! wish you enjoy it!";
        String[] words = example.toLowerCase().split("[ \\n\\t\\r.,;:!?()]+");

        Map<String, Integer> wordCountMap = new TreeMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
