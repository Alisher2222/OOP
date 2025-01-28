package Assignment_3.Part2.Task_11;
import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, null,
                "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
    public static void executeDefragmentation(String[] array) {
        int writeIndex = 0;

        for (String element : array) {
            if (element != null) {
                array[writeIndex++] = element;
            }
        }
        while (writeIndex < array.length) {
            array[writeIndex++] = null;
        }

    }
}