import java.util.Scanner;

public class E04UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] asciiChars = scanner.nextLine().toCharArray();

        StringBuilder result = new StringBuilder();
        for (char ch : asciiChars) {
            result.append(String.format("\\u%04x", (int) ch));
        }
        System.out.println(result);
    }
}

