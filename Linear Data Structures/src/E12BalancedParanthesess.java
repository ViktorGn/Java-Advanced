import java.util.ArrayDeque;
import java.util.Scanner;

public class E12BalancedParanthesess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> lifo = new ArrayDeque<>();
        boolean error = false;

        for (int i = 0; i < input.length(); i++) {
            char parenthes = input.charAt(i);
            switch (parenthes) {
                case '(':
                case '[':
                case '{':
                    lifo.push(parenthes);
                    break;
                default:
                    if (lifo.size() > 0) {
                        if (!isMatching(lifo.pop(), parenthes)) {
                            error = true;
                        }
                    } else error = true;
            }
            if (error) break;
        }
        if (error) System.out.println("NO");
        else
            System.out.println("YES");
    }

    private static boolean isMatching(char open, Character close) {
        boolean result = false;
        if ((open=='(') && (close==')')) result = true;
        if ((open=='[') && (close==']')) result = true;
        if ((open=='{') && (close=='}')) result = true;
        return result;
    }

}