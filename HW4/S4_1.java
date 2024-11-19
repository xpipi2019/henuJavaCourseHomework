/**
 * @author XPIPI
 */
class Animal {
    protected String name;
    private int age;
    private String species;
    private String habitat;

    public Animal(String name, int age, String species, String habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
    }

    public void makeSound() {
        System.out.println("The " + species + " makes a sound.");
    }

    public void displayInfo() {
        System.out.println("名称: " + name);
        System.out.println("年龄: " + age);
        System.out.println("种类: " + species);
        System.out.println("生活环境: " + habitat);
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }
}

    class Monkey extends Animal {
    // 继承Animal类
    private String hobby;
    private double weight;

    public Monkey(String name, int age, String habitat, String hobby, double weight) {
        super(name, age, "Monkey", habitat);
        this.hobby = hobby;
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("The monkey says 'Ooh ooh ah ah'.");
    }

    @Override
    public void eat() {
        System.out.println("The monkey is eating bananas.");
    }

    public void climbTree() {
        System.out.println("The monkey " + super.name + " is climbing a tree.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("爱好: " + hobby);
        System.out.println("体重: " + weight);
    }
}

public class S4_1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Ming", 5, "Lion", "Desert");

        Monkey monkey = new Monkey("George", 10, "Forest", "Swinging", 10.0);

        animal.displayInfo();
        monkey.displayInfo();

        animal.makeSound();
        monkey.makeSound();

        animal.eat();
        monkey.eat();

        monkey.climbTree();
    }
}
