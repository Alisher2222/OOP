package Assignment_2.Task_2;

public class Task_11 {
        public static void main(String[] args) {
            int[] array = {15, 64, 9, 51, 42};
            printSqrt(array);
        }

        public static void printSqrt(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int element = array[i];
                double sqrtValue = Math.sqrt(element);
                System.out.println("The square root for the number " + element + " is " + sqrtValue);
            }
        }
}
