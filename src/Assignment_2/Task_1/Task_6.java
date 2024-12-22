package Assignment_2.Task_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N != 0){
            int max = -10000000;
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = scanner.nextInt();
                if (arr[i] > max) max = arr[i];
            }
            System.out.print(max);
        }
    }
}
