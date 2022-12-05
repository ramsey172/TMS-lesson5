import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        arrayFill(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void arrayFill(int[][] arr) {
        int offset = 0;
        int half = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (j >= offset && j <= half || (j <= arr.length - 1 - offset && j > half)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            if (i < half) {
                offset++;
            } else {
                offset--;
            }

        }
    }


}