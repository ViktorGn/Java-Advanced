import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E03TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        Set<String> bannedWords = new HashSet(Arrays.asList(input));

        StringBuilder text = new StringBuilder(scanner.nextLine());

        for (String word: bannedWords) {
            int startIndex = text.indexOf(word);
            int wordLength = word.length();
            String mask = new String(new char[wordLength]).replace("\0", "*");
            while (startIndex >= 0){
                text.replace(startIndex, startIndex + wordLength, mask);
                startIndex = text.indexOf(word);
            }
        }
        System.out.println(text);
    }
}