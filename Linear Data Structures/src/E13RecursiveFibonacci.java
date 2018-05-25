import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E13RecursiveFibonacci {
    public static long memory[]=new long[51];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
            System.out.println(fibonacci(n + 1));
        }

    private static long fibonacci(int n) {
        if ((n==1) || (n==2)) {
            return 1;
        } else
        if (memory[n]!=0)
            return memory[n];
        else {
            long f= (fibonacci(n-1)+fibonacci(n-2));
            memory[n]=f;
            return f;
        }
    }
}
