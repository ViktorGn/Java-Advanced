import java.util.Scanner;

public class E04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        int maxSum=Integer.MIN_VALUE;
        int maxR = 0;
        int maxC = 0;
        for (int i = 0; i <rows-2 ; i++) {
            for (int j = 0; j <cols-2 ; j++) {
                int temp = sum3(i,j,m);
                if (temp>maxSum) {
                    maxSum=temp;
                    maxR=i;
                    maxC=j;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        print3(maxR,maxC,m);
    }

    private static int sum3(int i, int j, int[][] m) {
        int sum=0;
        for (int k = i; k <i+3 ; k++) {
            for (int l = j; l <j+3 ; l++) {
                sum+=m[k][l];
            }
        }
        return sum;
    }
    private static void print3(int i, int j, int[][] m) {
        for (int k = i; k <i+3 ; k++) {
            for (int l = j; l <j+3 ; l++) {
                System.out.printf("%d ",m[k][l]);
            }
            System.out.println();
        }
    }
}

