import java.math.BigInteger;
import java.util.Scanner;
public class E02TriangleArea {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double Ax = scanner.nextDouble();
        double Ay = scanner.nextDouble();
        scanner.nextLine();
        double Bx = scanner.nextDouble();
        double By = scanner.nextDouble();
        scanner.nextLine();
        double Cx = scanner.nextDouble();
        double Cy = scanner.nextDouble();
        long s =(int) (Math.abs(0.5*(Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))));
        System.out.println(s);
    }
}