import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[][][] arr3 = new int[][][]{
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {4, 7, 8},
                        {2, 3, 6}
                }
        };
        System.out.println("Введите число для увеличения элементов массива");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    arr3[i][j][k] += num;
                }
            }
        }
    }

}