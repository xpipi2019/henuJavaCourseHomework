import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author XPIPI
 */

public class HW05_12 {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();

        addPerson(persons, new Person("Bell", 30));
        addPerson(persons, new Person("CCC", 25));
        addPerson(persons, new Person("Bell", 35));
        addPerson(persons, new Person("CC", 40));
        addPerson(persons, new Person("CCC", 29));

        System.out.println("HashSet 中的 Person 对象：");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    private static void addPerson(Set<Person> persons, Person newPerson) {
        persons.remove(newPerson);
        persons.add(newPerson);
        //因为比较的只有姓名 先移除姓名相同的再加入来达到更新年龄的目的
    }
}

// Person类
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //重写 toString()方法 以此正常显示对象
    @Override
    public String toString() {
        return "Person { name = " + name + " , age = " + age + " }";
    }
}
