import java.util.ArrayDeque;
import java.util.Scanner;

public class E07ReverseStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        String line = scanner.nextLine();
        Scanner sc = new Scanner(line);
        while (sc.hasNextInt()) {
            stack.push(sc.nextInt());
        }
        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }
    }
}
