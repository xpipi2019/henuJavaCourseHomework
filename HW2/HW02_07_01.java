/**
 * @author XPIPI
 */
public class HW02_07_01 {
    public static void main(String[] args) {
        double res = 0;
        for(double i = 3;i <= 99;i += 2){
            res += (i-2)/i;
        }
        System.out.println("1/3+3/5+5/7+7/9+9/11+11/13+…+95/97+97/99 = " + res);
    }
}
