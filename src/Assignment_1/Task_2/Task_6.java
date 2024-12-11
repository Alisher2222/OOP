package Assignment_1.Task_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loop = "";
        int sum = 0;
        while (!loop.equals("ENTER")) {
            System.out.println("Write any integer number:");
            int num = scanner.nextInt();
            sum += num;
            System.out.println("If you want to finish and get the sum of entered numbers, write ENTER.");
            scanner.nextLine();
            loop = scanner.nextLine();
        }
        System.out.println("The sum of entered numbers is: " + sum);
        scanner.close();
    }
}
