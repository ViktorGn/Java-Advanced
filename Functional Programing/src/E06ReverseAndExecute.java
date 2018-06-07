import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E06ReverseAndExecute {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> words = Stream.of(input.readLine().split("\\s+"));
        int div = Integer.parseInt(input.readLine());
        Integer[] nums = words
                .map(w -> Integer.parseInt(w))
                .toArray(Integer[]::new);
        List<Integer> numL = Arrays.asList(nums);
        Collections.reverse(numL);

        numL.stream()
                .filter(x -> (x % div) != 0)
                .forEach(x -> System.out.printf("%d ", x));
    }
}