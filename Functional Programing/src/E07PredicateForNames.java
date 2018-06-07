import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class E07PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int maxLength = Integer.parseInt(input.readLine());

        Predicate<String> lengthFilter = s -> s.length() <= maxLength;

        String[] names = input.readLine().split("\\s+");

        Arrays.stream(names)
                .filter(lengthFilter)
                .forEach(System.out::println);
    }

}
