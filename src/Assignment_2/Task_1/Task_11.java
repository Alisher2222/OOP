package Assignment_2.Task_1;

public class Task_11 {
    public static void main(String[] args) {
        int[][][][] ultiarray = new int[][][][]{
                {
                        {
                                {4, 8, 15},
                                {16}
                        },
                        {
                                {23, 42},
                                {}
                        }
                },
                {
                        {
                                {1},
                                {2},
                                {3},
                                {4, 5}
                        }
                }
        };
        for (int[][][] block : ultiarray) {
            for (int[][] matrix : block) {
                for (int[] row : matrix) {
                    for (int num : row) {
                        System.out.print(num + " ");
                    }
                }
            }
        }
    }
}
