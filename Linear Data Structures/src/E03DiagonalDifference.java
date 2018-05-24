import java.util.Scanner;

public class E03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] m = new int[size][size];
        for (int i = 0; i < size; i++) {
            scanner.nextLine();
            for (int j = 0; j < size; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        int sumPdiag = 0;
        int sumSdiag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sumPdiag += m[i][j];
                }
                if ((i + j) == size - 1) {
                    sumSdiag += m[i][j];
                }
            }
        }
        System.out.println(Math.abs(sumPdiag-sumSdiag));
    }
}
