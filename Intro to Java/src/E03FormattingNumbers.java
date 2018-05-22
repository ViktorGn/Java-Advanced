import java.util.Scanner;

public class E03FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        String sa = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a, sa, b, c);
    }
}