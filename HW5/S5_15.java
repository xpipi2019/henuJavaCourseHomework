import java.util.HashMap;
import java.util.Map;

/**
 * @author XPIPI
 */

// HashMap
public class S5_15 {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        // <Key,Value> -> <Account,Password>
        userMap.put("user1", "pwd1");
        userMap.put("user2", "pwd2");
        userMap.put("user3", "pwd3");
        userMap.put("user4", "pwd4");
        userMap.put("user5", "pwd5");

        for (Map.Entry<String, String> entry : userMap.entrySet()) {
            System.out.println("用户名: " + entry.getKey() + ", 密码: " + entry.getValue());
        }
    }
}
