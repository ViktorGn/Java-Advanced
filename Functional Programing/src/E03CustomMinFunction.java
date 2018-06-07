import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class E03CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> words = Stream.of(input.readLine().split("\\s+"));
        Integer[] nums=words
                .map(w->Integer.parseInt(w))
                .toArray(Integer[]::new);

        Function<Integer[], Integer> min = (a) ->{
            Arrays.sort(a);
            return a[0];
        };
        System.out.println(min.apply(nums));
    }
}
