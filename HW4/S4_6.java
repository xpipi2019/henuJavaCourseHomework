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
public class S4_6 {
    public static void main(String[] args) {
        Outer.method().introduce();
    }
}
