package Assignment_2.Task_1;

public class Task_17 {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'a', 'b', 'c', 'd', 'e', 'f'},
                {'j', 'h', 'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p', 'q', 'r'},
                {'s', 't', 'u', 'v', 'w', 'x'}};
        for (int i = 1; i < 3; i++) {
            for(int j = 1; j < 5; j++){
                arr[i][j] = '-';
            }
        }
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 6; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
