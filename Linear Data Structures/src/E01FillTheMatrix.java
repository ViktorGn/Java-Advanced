import java.util.Scanner;

public class E01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(", ");
        int size = Integer.parseInt(tokens[0]);
        int [] [] m = new int[size][size]; //row col
        String type = new String(tokens[1]);
        if (type.equals("A")) {
            fillA(m, size);
        }
        else fillB(m, size);
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillB(int[][] m, int size) {
        int i = 1;
        Boolean flag = false;
        for (int col = 0; col < size; col++) {
            if (!flag) {
                for (int row = 0; row < size; row++) {
                    m[row][col] = i++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    m[row][col] = i++;
                }
            }
            flag = !flag;
        }
    }
    private static void fillA(int[][] m, int size) {
        int i=1;
        for (int col = 0; col <size ; col++) {
            for (int row = 0; row <size ; row++) {
                m[row][col] = i++;
            }
        }
    }
}

