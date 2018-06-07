import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class E09CustomComparator {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] text = input.readLine().split("\\s+");
        Integer[] nums = new Integer[text.length];
        for (int a = 0; a < text.length; a++) {
            nums[a] = Integer.parseInt(text[a]);
        }

        Comparator<Integer> special = (first, second) -> {
            boolean firstIsEven = first % 2 == 0;
            boolean secondIsEven = second % 2 == 0;
            if (firstIsEven && !secondIsEven) {
                return -1;
            } else if (!firstIsEven && secondIsEven) {
                return 1;
            } else {
                return first - second;
            }
        };
        Arrays.sort(nums, special);
        for (Integer integer : nums) {
            System.out.print(integer + " ");
        }
    }
}