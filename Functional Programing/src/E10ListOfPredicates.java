import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class E10ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int controlNumber = Integer.parseInt(bf.readLine());
        int[] input = Arrays.stream(bf.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<Integer> numbers = new HashSet<>();

        for (int a = 0; a < input.length; a++) {
            numbers.add(input[a]);
        }

        Predicate<Integer> predicate = (x) -> {
            for (Integer integer : numbers) {
                if (x % integer != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= controlNumber; i++) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}