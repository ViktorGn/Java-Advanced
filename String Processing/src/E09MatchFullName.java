import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E09MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";

        String input = bf.readLine();

        while (!"end".equals(input)){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
               System.out.println(matcher.group());
            }
            input = bf.readLine();
        }
    }
}
