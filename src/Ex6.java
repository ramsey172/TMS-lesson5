import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0, 2, 0}, {0, 1, 0, 4}, {1, 7, 2, 8}, {1, 2, 2, 9}};
        sortArr2(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void sortArr2(int[][] arr) {
        for (int[] ints : arr) {
            Arrays.sort(ints);
        }
    }


}