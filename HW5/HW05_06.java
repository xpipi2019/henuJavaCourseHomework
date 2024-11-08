/**
 * @author XPIPI
 */
import java.time.LocalDate;

public class HW05_06 {
    public static void main(String[] args) {
        LocalDate SpringFest = LocalDate.of(2025, 1, 29);
        long days = Math.abs(LocalDate.now().toEpochDay() - SpringFest.toEpochDay());
        System.out.println("距离蛇年春节还有 " + days + " 天。");
    }
}
