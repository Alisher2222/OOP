package Assignment_1.Task_2;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature;
        System.out.println("Write down the temperature in the room:");
        temperature = scanner.nextInt();
        if(temperature < 0){
            System.out.println("it’s cold outside.");
        }else{
            System.out.println("it’s warm outside.");
        }
    }
}
