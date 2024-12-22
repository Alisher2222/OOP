package Assignment_2.Task_1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N != 0){
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = scanner.nextInt();
            }
            if(N%2 == 0){
                for(int i = N-1; i >= 0; i-- ){
                    System.out.print(arr[i] + " ");
                }
            }else{
                for(int i = 0; i < N; i++){
                    System.out.print(arr[i]  + " ");
                }
            }
        }
    }
}
