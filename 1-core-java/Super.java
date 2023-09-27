class Animal {
    Animal(String name) {
        System.out.println(name + " Animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog"); // This is mandatory as Animal does not have a no-argument constructor
        System.out.println("Dog is created");
    }
}

public class Super {
    public static void main(String[] args) {
        new Dog();
    }
}

