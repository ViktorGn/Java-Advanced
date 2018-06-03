import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05Palindromes {
    public static void main(String[] args) throws IOException {
        Set<String> palindromes = new TreeSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();

        String regex = "[^\\s,.?!]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean isFound = matcher.find();

        while (isFound){
            String word = matcher.group();
            String reversed = new StringBuilder(word).reverse().toString();

            if (word.equals(reversed))
                palindromes.add(word);
            isFound = matcher.find();
        }
        System.out.println(palindromes.toString());
    }
}
