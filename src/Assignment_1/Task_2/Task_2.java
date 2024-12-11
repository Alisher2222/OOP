package Assignment_1.Task_2;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down your name.");
        String name = scanner.nextLine();
        System.out.println("Write down your age.");
        int age = scanner.nextInt();
        String output = (age >=28 || age <= 18) ?
                name + ", come to the military registration and enlistment office":
                "you are free to go";
        System.out.println(output);
    }
}
