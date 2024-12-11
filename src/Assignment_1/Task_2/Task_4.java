package Assignment_1.Task_2;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String output = (age >= 20 && age <= 60) ? "":"you do not have to work.";
        System.out.println(output);
    }
}
