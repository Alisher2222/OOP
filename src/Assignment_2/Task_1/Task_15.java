package Assignment_2.Task_1;
import java.util.Scanner;
public class Task_15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] array = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 3; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
