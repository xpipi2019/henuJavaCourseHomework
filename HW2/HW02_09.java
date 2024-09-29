/**
 * @author XPIPI
 */
public class HW02_09 {
    public static void main(String[] args) {
        int sum = 0,cnt = 0;
        for(int i = 1;i <= 1000;i++){
            if(i % 7 == 0||i / 100 == 7||i / 10 % 10 == 7||i % 10 == 7) {
                //倍数 个位 十位 百位
                cnt++;
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("总个数=" + cnt);
        System.out.println("总和=" + sum);
    }
}