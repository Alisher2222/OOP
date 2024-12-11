package Assignment_1.Task_2;

public class Task_8 {
    public static void main(String[] args){
        int sum = 0;
        int counter = 1;
        while(counter < 100){
            sum = (counter < 3 || (counter % 3 != 0)) ? sum + counter : sum;
            counter++;
        }
        System.out.println(sum);
    }
}
