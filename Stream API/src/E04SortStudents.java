import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class E04SortStudents {
static class StudentE4 {
    String firstName;
    String lastName;

    StudentE4(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
    static Comparator<StudentE4> by2names = (StudentE4 o1, StudentE4 o2) -> {
        int c = o1.lastName.compareTo(o2.lastName);
        if (c==0) {
            c=o2.firstName.compareTo(o1.firstName);
        }
        return c;
    };

   public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE4> studens = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            studens.add(new StudentE4(tokens[0], tokens[1]));
        }
        studens.stream()
                .sorted(by2names)
                .forEach(e -> System.out.printf("%s %s\n", e.firstName, e.lastName));
    }

}


