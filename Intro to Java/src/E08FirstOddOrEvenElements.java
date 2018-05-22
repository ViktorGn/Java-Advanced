import java.util.Scanner;

public class E08FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] tokens = scanner.nextLine().split("\\s+");
        String [] command = scanner.nextLine().split("\\s+");
        int n = tokens.length;
        int k = Integer.parseInt(command[1]);
        int [] numbers = new int[tokens.length];
        for (int i = 0; i < n ; i++) {
            numbers [i] = Integer.parseInt(tokens[i]);
        }
        int j=0;
        while ((j<n)&&(k>0)) {
            if (command[2].equals("odd")) {
                if (numbers[j]%2 !=0) {
                    System.out.printf("%d ",numbers[j]);
                    k--;
                }
            } else if (numbers[j]%2 ==0) {
                System.out.printf("%d ",numbers[j]);
                k--;
            }
            j++;
        }
    }
}
