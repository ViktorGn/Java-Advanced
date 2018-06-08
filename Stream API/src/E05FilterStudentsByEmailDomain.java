import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class E05FilterStudentsByEmailDomain {
    static class StudentE5 {
        String firstName;
        String lastName;
        String email;

        StudentE5(String fn, String ln, String em) {
            this.firstName = fn;
            this.lastName = ln;
            this.email = em;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE5> studens = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            studens.add(new StudentE5(tokens[0], tokens[1],tokens[2]));
        }
        studens.stream()
                .filter(e->e.email.contains("@gmail.com"))
                .forEach(e -> System.out.printf("%s %s\n", e.firstName, e.lastName));
    }

}
