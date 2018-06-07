import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class E01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer <String> print =  x->{
            System.out.println(x);
        };

        Stream<String> words = Stream.of(scanner.nextLine().split("\\s+"));
        words.forEach(print);
    }
}
