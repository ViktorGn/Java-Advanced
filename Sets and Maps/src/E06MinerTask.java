import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class E06MinerTask {
    public static void main(String[] args) throws IOException {
        Map<String, Long> resources = new HashMap<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input1 = console.readLine();
            if (input1.equals("stop")) break;
            String input2 = console.readLine();
            Long count = resources.get(input1);
            resources.put(input1, (count == null) ? Long.parseLong(input2) : count + Long.parseLong(input2));
        };
        for (Map.Entry<String,Long> e : resources.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
