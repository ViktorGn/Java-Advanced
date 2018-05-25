/*
import java.util.Arrays;
import java.util.Scanner;

public class E05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numRowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[numRowsAndCols[0]][numRowsAndCols[1]];

        for (int a = 0; a < numRowsAndCols[0]; a++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int b = 0; b < numRowsAndCols[1]; b++) {
                matrix[a][b] = input[b];
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            try {

                String[] tokens = command.split("\\s+");
                String swap = tokens[0];

                if (!swap.equals("swap") && tokens.length != 5) {
                    System.out.println("Invalid input!");
                } else {
                    int x1 = Integer.parseInt(tokens[1]);
                    int y1 = Integer.parseInt(tokens[2]);
                    int x2 = Integer.parseInt(tokens[3]);
                    int y2 = Integer.parseInt(tokens[4]);
                    if (x1 > numRowsAndCols[0] || y1 > numRowsAndCols[1] ||
                            x2 > numRowsAndCols[0] || y2 > numRowsAndCols[1]) {
                        System.out.println("Invalid input!");
                    } else {
                        String number = matrix[x1][y1];
                        matrix[x1][y1] = matrix[x2][y2];
                        matrix[x2][y2] = number;

                        for (String[] strings : matrix) {
                            for (String string : strings) {
                                System.out.print(string + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            } catch (IndexOutOfBoundsException | NumberFormatException e){
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}*/
