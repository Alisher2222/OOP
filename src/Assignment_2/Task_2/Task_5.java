package Assignment_2.Task_2;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
    }
    public static void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversedArray[array.length-1-i] = array[i];
        }
        printArray(reversedArray);
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
