import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] result = multiply(arr1, arr2);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }


}