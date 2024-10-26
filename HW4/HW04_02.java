/**
 * @author XPIPI
 */
final class classA {
    private final int intA = 100;
    private int intB = 50;

    public classA(int variable) {
        this.intB = variable;
        // intA = 200; final修饰无法修改
    }

    public final void finalDisplay() {
        System.out.println("intA: " + intA);
    }
    //final 修饰无法重写

    public void normalDisplay() {
        System.out.println("intB: " + intB);
    }

    public int getintB() {
        return intB;
    }

    public void setintB(int intB) {
        this.intB = intB;
    }
}

    /*
    class classB extends classA{
    }
    final 类无法继承
     */

public class HW04_02 {
    public static void main(String[] args) {
        classA myObject = new classA(200);

        myObject.finalDisplay();
        myObject.normalDisplay();

        myObject.setintB(300);
        myObject.normalDisplay();
    }
}
