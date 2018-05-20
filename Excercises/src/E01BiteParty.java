import java.math.BigDecimal;
import java.util.Scanner;

public class E01BiteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double s= a*b;
        System.out.printf("%.2f",s);
    }

    private static void timeOut() {
        String s = "121231312312312312312";
        for (long i = 0; i <Long.MAX_VALUE ; i++) {
            s=s+"1";
        }
    }
    public static void memory() {
        int mx=Integer.MAX_VALUE/1000;
        String s1="1212121212121212121212fsdafsdafsadfsdfadfd";
        for (int i = 0; i <mx ; i++) {
            s1=s1+s1;
        }
    }
}
