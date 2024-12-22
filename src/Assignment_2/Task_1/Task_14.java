package Assignment_2.Task_1;

import java.util.Scanner;
public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
                sum +=array[i][j];
            }
        }
        System.out.println(sum);
    }
}
