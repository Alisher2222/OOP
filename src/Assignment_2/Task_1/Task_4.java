package Assignment_2.Task_1;

public class Task_4 {
    public static void main(String[] args){
        int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int [] resultArray = new int[firstArray.length + secondArray.length];
        for(int i = 0; i < firstArray.length; i++){
            resultArray[i] = firstArray[i];
        }
        int j = 0;
        for(int i = firstArray.length; i < firstArray.length+secondArray.length-1; i++){
            resultArray[i] = secondArray[j];
            j++;
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
