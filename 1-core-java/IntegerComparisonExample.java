public class IntegerComparisonExample {
    public static void main(String[] args) {
        // Using == with primitive int
        int num1 = 127;
        int num2 = 127;

        System.out.println("Using == with primitive int:");
        System.out.println("num1 == num2: " + (num1 == num2)); // true

        int num3 = 128;
        int num4 = 128;

        System.out.println("num3 == num4: " + (num3 == num4)); // true or false (implementation-dependent)

        // Using == with Integer objects
        Integer obj1 = 127;
        Integer obj2 = 127;

        System.out.println("\nUsing == with Integer objects:");
        System.out.println("obj1 == obj2: " + (obj1 == obj2)); // true

        Integer obj3 = 128;
        Integer obj4 = 128;

        System.out.println("obj3 == obj4: " + (obj3 == obj4)); // false

        // Using .equals with Integer objects
        System.out.println("\nUsing .equals with Integer objects:");
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // true
        System.out.println("obj3.equals(obj4): " + obj3.equals(obj4)); // true
    }
}

