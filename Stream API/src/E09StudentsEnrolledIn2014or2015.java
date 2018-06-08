import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class E09StudentsEnrolledIn2014or2015 {
    static class StudentE9 {
        String facultyNum;
        List<Integer> marks;

        StudentE9(String fn) {
            this.facultyNum = fn;
            this.marks = new LinkedList<>();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE9> students = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            StudentE9 st = new StudentE9(tokens[0]);

            for (int i = 0; i <4 ; i++) {
                st.marks.add(Integer.parseInt(tokens[1+i]));
            }
            students.add(st);
        }
        students.stream()
                .filter(byYear)
                .forEach(e ->
                        System.out.println(Arrays.toString(e.marks.toArray()).replaceAll("[\\[\\],]","")));
    }

    static Predicate<StudentE9> byYear = (o1) ->
    {
        return o1.facultyNum.matches("\\d+1[45]$");

    };
}
