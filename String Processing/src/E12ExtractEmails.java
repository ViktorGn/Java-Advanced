import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E12ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split("[,? ]");
        String regex = "^[a-z]([A-Za-z0-9.-_]+)\\.?-?\\w+?@\\w+-?\\.?(\\w+)?\\.?(\\w+)?\\.\\w+";
        Pattern pattern = Pattern.compile(regex);

        for (int a = 0; a < input.length; a++) {
            Matcher matcher = pattern.matcher(input[a]);
            if (matcher.find()){
                System.out.println(matcher.group());
            }
        }

    }
}
