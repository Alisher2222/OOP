package Assignment_2.Task_1;
import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] MULTIPLICATION_TABLE = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                MULTIPLICATION_TABLE[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
