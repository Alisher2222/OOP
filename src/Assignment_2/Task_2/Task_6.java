package Assignment_2.Task_2;

public class Task_6 {
    public static void main(String[] args) {
        // Calling all 10 methods with different parameters
        universalMethod("Hello, World!");
        universalMethod(5, 10);
        universalMethod(3.14);
        universalMethod("Java", 42);
        universalMethod(10, 20, 30);
        universalMethod("This is a test.", true);
        universalMethod("Hello", 3.14, false);
        universalMethod("Count to", 1, 2, 3, 4, 5);
        universalMethod("Multiply", 2, 3);
        universalMethod("Sum", 1.5, 2.5);
    }
    public static void universalMethod(String message) {
        System.out.println("Message: " + message);
    }
    public static void universalMethod(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    public static void universalMethod(double number) {
        System.out.println("Double value: " + number);
    }
    public static void universalMethod(String text, int number) {
        System.out.println("Text: " + text + ", Number: " + number);
    }
    public static void universalMethod(int x, int y, int z) {
        System.out.println("Sum of three numbers: " + (x + y + z));
    }
    public static void universalMethod(String phrase, boolean flag) {
        System.out.println("Phrase: " + phrase + ", Flag: " + flag);
    }
    public static void universalMethod(String text, double value, boolean flag) {
        System.out.println("Text: " + text + ", Double: " + value + ", Flag: " + flag);
    }
    public static void universalMethod(String label, int... numbers) {
        System.out.print(label + ": ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void universalMethod(String operation, int a, int b) {
        if ("Multiply".equals(operation)) {
            System.out.println("Multiplication: " + (a * b));
        } else {
            System.out.println("Unknown operation");
        }
    }
    public static void universalMethod(String operation, double a, double b) {
        if ("Sum".equals(operation)) {
            System.out.println("Sum of doubles: " + (a + b));
        } else {
            System.out.println("Unknown operation");
        }
    }
}
