import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E08BaisicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pushElements = scanner.nextInt();
        int popElements = scanner.nextInt();
        int targetElement = scanner.nextInt();
        scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String line = scanner.nextLine();
        Scanner sc = new Scanner(line);
        while (sc.hasNextInt()) {
            stack.push(sc.nextInt());
        }
        for (int i = 0; i <popElements ; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(targetElement)) {
            System.out.println("true");
        } else {
           Object[] ar = stack.toArray();
           Arrays.sort(ar);
            System.out.println(ar[0]);
        }
    }
}
