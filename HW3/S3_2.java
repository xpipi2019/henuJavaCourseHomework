/**
 * @author XPIPI
 */
class MonkeyAssistant {
    private String name;
    private int age;
    private double weight;
    private String hobby;
    private double temperature;

    public MonkeyAssistant() {
        name = "Unknown";
        age = 0;
        weight = 0.0;
        hobby = "Unknown";
        temperature = 0.0;
    }

    public MonkeyAssistant(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.hobby = "Unknown";
        this.temperature = 0.0;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void printDetails() {
        System.out.println("名字: " + name);
        System.out.println("年龄: " + age);
        System.out.println("体重: " + weight);
        System.out.println("爱好: " + hobby);
    }

    public void climbTree() {
        System.out.println("Monkey " + name + " is climbing a tree.");
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double celsiusToFahrenheit(int celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

public class S3_2 {
    // public class TestMonkeyAssistant{}
        public static void main(String[] args) {
            // 默认无参数构造方法
            MonkeyAssistant assistant1 = new MonkeyAssistant();
            // 有参数的构造方法
            MonkeyAssistant assistant2 = new MonkeyAssistant("皮皮", 2, 48.0);

            System.out.println("Assistant 1:");
            assistant1.printDetails();
            System.out.println("Assistant 2:");
            assistant2.printDetails();

            System.out.println();
            assistant1.climbTree();
            assistant2.climbTree();

            System.out.println();
            double celsius = 30.0;
            System.out.println("Assistant 1: " + celsius + " 摄氏度 --> " + assistant1.celsiusToFahrenheit(celsius) + " 华氏度");
            double fahrenheit = 86.0;
            System.out.println("Assistant 2: " + fahrenheit + " 华氏度 --> " + assistant2.fahrenheitToCelsius(fahrenheit) + " 摄氏度");
        }
}
