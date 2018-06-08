import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class E06FilterStudentsByPhone {
    static class StudentE6 {
        String firstName;
        String lastName;
        String phone;

        StudentE6(String fn, String ln, String ph) {
            this.firstName = fn;
            this.lastName = ln;
            this.phone = ph;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE6> students = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            students.add(new StudentE6(tokens[0], tokens[1],tokens[2]));
        }
        students.stream()
                .filter(byPhone)
                .forEach(e -> System.out.printf("%s %s\n", e.firstName, e.lastName));
    }
    static Predicate<StudentE6> byPhone = (o1) ->
    {
        return o1.phone.matches("02\\d+|\\+3592\\d+");
    };
}


