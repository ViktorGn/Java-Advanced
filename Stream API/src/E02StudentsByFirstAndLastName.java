import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class E02StudentsByFirstAndLastName {
    static class StudentE2 {
        String firstName;
        String lastName;
        int group;

        StudentE2(String fn, String ln, int gt) {
            this.firstName = fn;
            this.lastName = ln;
            this.group = gt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE2> studens = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            studens.add(new StudentE2(tokens[0], tokens[1], 0));
        }

        studens.stream()
                .filter(s -> s.lastName.compareTo(s.firstName) > 0)
                .forEach(e -> System.out.printf("%s %s\n", e.firstName, e.lastName));
    }
}
