package Assignment_1.Task_2;
import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int heightUpper = (height - height%2)/2 + height%2;
        int heightBottom = height-heightUpper;
        for (int i = 1; i <= heightUpper; i++) {
            for (int j = 1; j <= heightUpper - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        for (int i = heightBottom; i >= 1; i--) {
            for (int j = 1; j <= heightUpper - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
