import java.util.Scanner;

public class E04CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double f1pr=(Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2));
        double f1=Math.pow(f1pr,(a+b+c)/Math.sqrt(c));
        double f2pr=(a*a+b*b-c*c*c);
        double f2=Math.pow(f2pr,(a-b));
        double diff=Math.abs((a+b+c)/3-(f1+f2)/2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1,f2,diff );
//        F1 result: 6.45; F2 result: 8.00; Diff: 3.89
  }
}
