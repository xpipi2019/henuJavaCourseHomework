/**
 * @author XPIPI
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Pattern 用来写正则表达式  Matcher 匹配器主要用来匹配

public class HW05_08_optional {
    public static void main(String[] args) {
        String text = "中华人民共和国成立于1949年10月1日";

        Pattern pattern1 = Pattern.compile("\\d");
        Pattern pattern2 = Pattern.compile("\\d+");

        Matcher matcher = pattern1.matcher(text);
        System.out.println("提取的数字有('\\\\d')：");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();

        matcher = pattern2.matcher(text);
        System.out.println("提取的数字有('\\\\d+')：");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
