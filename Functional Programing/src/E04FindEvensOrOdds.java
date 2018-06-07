import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class E04FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        //input type one-time
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String [] boundString = input.readLine().split("\\s+");
        String oddEven = input.readLine();
        int min=Integer.parseInt(boundString[0]);
        int max=Integer.parseInt(boundString[1]);

        //predicate
        Predicate <Integer> isOdd = n->{
            return (n%2==0);
        };

        for (int i = min; i <=max ; i++) {
            if (oddEven.equals ("odd")) {
                if (!isOdd.test(i)) System.out.printf("%d ", i);
            } else {
                if (isOdd.test(i)) System.out.printf("%d ", i);
            }
        }
    }
}
