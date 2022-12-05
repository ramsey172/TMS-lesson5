import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        String[] colors = new String[]{"W", "B"};
        int index;
        for (int i = 0; i < chess.length; i++) {
            index = isEven(i) ? 0 : 1;
            for (int j = 0; j < chess[i].length; j++) {
                chess[i][j] = colors[index];
                index = switchIndex(index);
            }
        }
        for (String[] strings : chess) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int switchIndex(int index) {
        return index == 1 ? 0 : 1;
    }

}