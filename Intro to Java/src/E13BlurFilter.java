import java.util.Scanner;

public class E13BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long blurValue = Integer.parseInt(scanner.nextLine());
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();
        long [][] m = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        int blurR = scanner.nextInt();
        int blurC = scanner.nextInt();
        blur(blurValue, blurR, blurC, rows, cols, m);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }

    private static void blur(long blurValue, int blurR, int blurC, int rows, int cols, long[][] m) {
        for (int i = blurR-1; i <=blurR+1 ; i++) {
            for (int j = blurC-1; j <=blurC+1 ; j++) {
                if ((i>=0)&&(i<rows)&&(j>=0)&&(j<cols)){
                    m [i][j]+=blurValue;
                }
            }
        }
    }

}
