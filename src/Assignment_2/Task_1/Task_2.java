package Assignment_2.Task_1;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] array = new String[num];
        for(int i = 0; i < num; i++){
            array[i] = (i % 2 == 0) ? "Even" : "Odd";
            System.out.println(array[i]);
        }
    }
}
