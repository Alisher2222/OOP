package Assignment_2.Task_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n != 0) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLine();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] != null) {
                    boolean isDuplicate = false;
                    for (int j = 0; j < n; j++) {
                        if (i != j && arr[j] != null && arr[i].equals(arr[j])) {
                            arr[j] = null;
                            isDuplicate = true;
                        }
                    }
                    if (isDuplicate) {
                        arr[i] = null;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
