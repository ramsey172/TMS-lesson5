public class Ex4 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int sum = getSum(arr);
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int getSum(int[][] arr) {
        int result = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                result += anInt;
            }
        }
        return result;
    }


}