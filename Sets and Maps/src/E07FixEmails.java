import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class E07FixEmails {
    public static void main(String[] args) throws IOException {
        Map<String, String> directory = new LinkedHashMap<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = console.readLine();
            if (name.equals("stop")) break;
            String email = console.readLine();
            if (!email.contains(".us")&&!email.contains(".uk")&&!email.contains(".com")){
            directory.put(name, email);}
        };
        for (Map.Entry<String, String> e : directory.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }

}
