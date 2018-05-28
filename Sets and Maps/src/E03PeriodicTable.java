import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class E03PeriodicTable {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Set<String> elements=new TreeSet<>();
        int count = Integer.parseInt(console.readLine());
        for (int i = 0; i <count; i++) {
            String[] lineX=console.readLine().split("\\s+");
            for (int j = 0; j <lineX.length ; j++) {
                elements.add(lineX[j]);
            }
        }
//        String out=elements.toString().replace(",", "");
//        System.out.println(out);
        for (String e:elements) {
            System.out.printf("%s ",e);
        }
    }
}
