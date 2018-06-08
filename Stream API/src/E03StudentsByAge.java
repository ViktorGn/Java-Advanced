import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class StudentE3 implements Comparator{
        String firstName;
        String lastName;
        int age;

        StudentE3(String fn, String ln, int gt) {
            this.firstName = fn;
            this.lastName = ln;
            this.age = gt;
        }

    @Override
    public int compare(Object o1, Object o2) {
        StudentE3 s1 = (StudentE3) o1;
        StudentE3 s2 = (StudentE3) o2;
            return s1.age-s2.age;
    }
}

public class E03StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE3> studens = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            studens.add(new StudentE3(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
        }
        studens.stream()
                .filter(s -> s.age>=18&&s.age<=24)
                .forEach(e -> System.out.printf("%s %s %d\n", e.firstName, e.lastName, e.age));
    }
}
