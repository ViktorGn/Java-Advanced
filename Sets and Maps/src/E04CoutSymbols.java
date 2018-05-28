import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class E04CoutSymbols {
    public static void main(String[] args) throws IOException {
        Map<Character, Long> stats = new TreeMap<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = console.readLine();
        char[] charArray = input.toCharArray();
        for (Character ch : charArray) {
            Long freq = stats.get(ch);
            stats.put(ch, (freq == null) ? 1 : freq + 1);
        }
        for (Character ch : stats.keySet()) {
            System.out.printf("%c: %d time/s%n", ch, stats.get(ch));
        }
    }
}
