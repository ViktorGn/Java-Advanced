import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class E05PhoneBook {
    public static void main(String[] args) throws IOException {
        Map <String,String> phoneBook = new HashMap<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = console.readLine();
        while (!input.equals("search")){
            String [] currentEntry =input.split("-");
            phoneBook.put(currentEntry[0], currentEntry[1]);
            input = console.readLine();
        }
        input = console.readLine();
        while (!input.equals("stop")) {
            String result = phoneBook.get(input);
//            StringBuilder sb = new StringBuilder();
            String output ="";
            if (result == null) {
                output=String.format("Contact %s does not exist.", input);
            } else output=String.format("%s -> %s", input, result);
            System.out.println(output);
            input = console.readLine();
        }
    }
}
