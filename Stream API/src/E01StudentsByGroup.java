import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class E01StudentsByGroup {

static class StudentE1 {
        String names;
        int group;
        StudentE1(String fn, int gt) {
            this.names = fn;
            this.group = gt;
        }
    }
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<StudentE1> studens = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            studens.add(new StudentE1(tokens[0]+" "+tokens[1], Integer.parseInt(tokens[2])));
        }

        studens.stream()
                .filter(e->e.group==2)
                .sorted((a,b)->a.names.compareTo(b.names))
//                .sorted(byNameLenght)
//                .sorted(byNameStd)
                .forEach( e->System.out.printf("%s\n",e.names));
    }
    static Comparator<StudentE1> byNameStd = new Comparator<StudentE1>() {
        @Override
        public int compare(StudentE1 o1, StudentE1 o2) {
            return o1.names.compareTo(o2.names);
        }
    };
    static Comparator<StudentE1> byNameLenght = (StudentE1 o1, StudentE1 o2) ->
    {
        return o1.names.length()-o2.names.length();
    };

}
