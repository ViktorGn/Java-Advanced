import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E08FindTheSmallestElement {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> nums = Arrays.stream(bf.readLine().split("\\s+"))
                    .map(Integer::parseInt).collect(Collectors.toList());

            Function<List<Integer>,Integer> func = x -> {
                int min = Integer.MAX_VALUE;
                int pointer = 0;
                for (int a = 0; a < x.size(); a++) {
                    if (x.get(a) <= min){
                        min = x.get(a);
                        pointer=a;
                    }
                }
                return pointer;
            };
            System.out.println(func.apply(nums));
        }

    }
