public class Ex5 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0, 2, 0}, {0, 1, 0, 4}, {1, 7, 2, 8}, {1, 2, 2, 9}};
        printDiagonals(arr);
    }

    public static void printDiagonals(int[][] arr) {
        StringBuilder diagonal1 = new StringBuilder();
        StringBuilder diagonal2 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            diagonal1.append(arr[i][i]).append(" ");
            diagonal2.append(arr[i][arr[i].length - 1 - i]).append(" ");
        }
        System.out.println(diagonal1);
        System.out.println(diagonal2);
    }


}