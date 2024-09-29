/**
 * @author XPIPI
 */
public class HW02_08 {
    public static void main(String[] args) {
        int now = 0,time = 0;
        while (true) {
            now += 4;
            time++;
            if (now >= 100) {
                break;
            } else {
                now -= 1;
            }
        }
        System.out.println(time);
    }
}