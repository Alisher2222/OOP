package Assignment_2.Task_1;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
