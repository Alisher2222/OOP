package Assignment_1.Task_2;
import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        for(int i = start; i < end; i++){
            if(i%multiple == 0){
                System.out.println(i);
            }
        }
    }
}
