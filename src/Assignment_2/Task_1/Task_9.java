package Assignment_2.Task_1;

public class Task_9 {
    public static void main(String[] args){
        int[][] result = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                result[i][j] = i+j;
            }
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
