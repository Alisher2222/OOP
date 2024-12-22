package Assignment_2.Task_1;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] rowSizes = new int[N];
        for (int i = 0; i < N; i++) {
            rowSizes[i] = scanner.nextInt();
        }
        int[][] multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            multiArray[i] = new int[rowSizes[i]];
        }
        for (int i = 0; i < multiArray.length; i++) {
            System.out.println("Row " + i + ": size " + multiArray[i].length);
        }
    }
}
