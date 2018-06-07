import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class E05AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> words = Stream.of(input.readLine().split("\\s+"));
        Integer[] nums = words
                .map(w -> Integer.parseInt(w))
                .toArray(Integer[]::new);
        Consumer<Integer[]> print = arr -> System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));

        String command = input.readLine().toLowerCase();
        Function<String, Function<Integer, Integer>> operation = s -> {
            switch (s) {
                case "add":
                    return n -> n + 1;
                case "multiply":
                    return n -> n * 2;
                case "subtract":
                    return n -> n - 1;
                default:
                    return null;
            }
        };

        while (!command.equals("end")) {
            if (command.equals("print")) {
                print.accept(nums);
            } else {
                int i = 0;
                for (int n : nums) {
                    nums[i] = operation.apply(command).apply(n);
                    i++;
                }
            }
            command = input.readLine().toLowerCase();
        }
    }
}
