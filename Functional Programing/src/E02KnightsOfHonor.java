import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class E02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = x->{
            System.out.println("Sir "+x);
        };

        Stream<String> words = Stream.of(scanner.nextLine().split("\\s+"));
        words.forEach(print);
    }
}

