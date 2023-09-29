import java.util.*;

/**
 * This Java program demonstrates a scenario where the compareTo method is inconsistent with equals method.
 * In this example, a TreeSet is used to store Person objects, where Person class implements Comparable interface.
 * The compareTo method of Person class compares Person objects based on their ages.
 * However, the equals method compares Person objects based on their names.
 *
 * As a result, when two Person objects having the same age but different names are added to the TreeSet,
 * the second Person object is considered equal to the first one by the TreeSet and hence, it is not added.
 * 
 * The main method will print only one Person object, demonstrating that the second Person object is not added 
 * to the TreeSet even though they are not equal according to the equals method.
 * 
 * The purpose of this example is to illustrate the importance of maintaining consistency between equals 
 * and compareTo methods when using classes like TreeSet in Java.
 * 
 * Example provided by OpenAI's ChatGPT.
 */

public class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // comparing by age
        return this.age - other.age; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        // comparing by name
        return Objects.equals(name, person.name); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 25);

        TreeSet<Person> set = new TreeSet<>();
        set.add(p1);
        // p2 will not be added as it is considered "equal" to p1 by the compareTo method
        set.add(p2);

        // Will only print one person, i.e., "John", 25
        // even though p1.equals(p2) is false
        for (Person p : set) {
            System.out.println(p.name + ", " + p.age);
        }
    }
}
