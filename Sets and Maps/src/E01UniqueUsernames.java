import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class E01UniqueUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Set<String> userNames=new LinkedHashSet<>();
        int count = Integer.parseInt(console.readLine());
        for (int i = 0; i <count; i++) {
            userNames.add(console.readLine());
        }
        for (String uniqueName:userNames) {
            System.out.println(uniqueName);
        }
    }
}
