import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class E07ExcellentStudents {
    static class StudentE7 {
        String firstName;
        String lastName;
        List<Integer> marks;

        StudentE7(String fn, String ln) {
            this.firstName = fn;
            this.lastName = ln;
            this.marks = new LinkedList<>();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE7> students = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            StudentE7 st = new StudentE7(tokens[0], tokens[1]);

            for (int i = 0; i <4 ; i++) {
                st.marks.add(Integer.parseInt(tokens[2+i]));
            }
            students.add(st);
            }
        students.stream()
                .filter(byMarks)
                .forEach(e -> System.out.printf("%s %s\n", e.firstName, e.lastName));
    }

    static Predicate<StudentE7> byMarks = (o1) ->
    {
        return o1.marks.contains((Integer) 6);
    };
}
