/**
 * @author XPIPI
 */
import java.time.LocalDate;

public class HW05_06 {
    public static void main(String[] args) {
        LocalDate SpringFest = LocalDate.of(2025, 1, 29);
        long days = Math.abs(LocalDate.now().toEpochDay() - SpringFest.toEpochDay());
        // toEpochDay() 这个方法的返回类型是long，它将转换值返回为纪元天数。
        System.out.println("距离蛇年春节还有 " + days + " 天。");
    }
}
