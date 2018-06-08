import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class E08WeakStudents {
    static class StudentE8 {
        String firstName;
        String lastName;
        List<Integer> marks;

        StudentE8(String fn, String ln) {
            this.firstName = fn;
            this.lastName = ln;
            this.marks = new LinkedList<>();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE8> students = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            StudentE8 st = new StudentE8(tokens[0], tokens[1]);

            for (int i = 0; i <4 ; i++) {
                st.marks.add(Integer.parseInt(tokens[2+i]));
            }
            students.add(st);
        }
        students.stream()
                .filter(byMarks2)
                .forEach(e -> System.out.printf("%s %s\n", e.firstName, e.lastName));
    }

    static Predicate<StudentE8> byMarks2 = (o1) ->
    {
        long weekMarks= o1.marks.stream()
                .filter(e->e<=3)
                .count();
        return weekMarks>=2?true:false;
    };
}

