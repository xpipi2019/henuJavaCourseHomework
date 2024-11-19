/**
 * @author XPIPI
 */
public class S2_3_1_while {
    public static void main(String[] args) {
        double n = 1,res = 0;
        while (n < 99) {
            res += n / (n + 2);
            n = n + 2;
        }
        System.out.println("1/3+3/5+5/7+7/9+9/11+11/13+…+95/97+97/99 = " + res);
    }
}
