package Assignment_1.Task_2;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down your body temperature");
        int temperature = scanner.nextInt();
        boolean isHigh = (temperature > 36);
        boolean isLow = (temperature < 36);
        if(isHigh){
            System.out.println("The body temperature is high.");
        }else if(isLow){
            System.out.println("The body temperature is low.");
        }else{
            System.out.println("The body temperature is normal.");
        }
    }
}
