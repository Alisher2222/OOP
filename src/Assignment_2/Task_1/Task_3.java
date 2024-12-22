package Assignment_2.Task_1;
import java.util.Scanner;
import java.util.Random;
public class Task_3 {
    public static void main(String[] args){
        int[] array = new int[]{-1, 2, 3, -4, -5};
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i]%2 == 0) ? array[i]*(-1): array[i];
            System.out.println(array[i]);
        }
    }
}
