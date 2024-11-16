/**
 * @author XPIPI
 */
interface Inner {
    void introduce();
}

class Outer {
    public static Inner method() {
        return () -> System.out.println("实现了Inner接口的匿名内部类！");
        //lambda
    }
}

// class InnerClassTest {}
public class HW04_06 {
    public static void main(String[] args) {
        Outer.method().introduce();
    }
}
