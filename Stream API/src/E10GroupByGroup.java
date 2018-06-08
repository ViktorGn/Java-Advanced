import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static java.util.stream.Collectors.*;

public class E10GroupByGroup {
    static class Person {
        String name;
        Integer group;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getGroup() {
            return group;
        }

        public void setGroup(Integer group) {
            this.group = group;
        }

        public Person(String name, Integer group) {
            this.name = name;
            this.group = group;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
static  Map<Integer,List<Person>> studentsByGroup;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = "";
        List<Person> students = new LinkedList<>();

        while (!"END".equalsIgnoreCase(inputText = reader.readLine())) {
            String[] tokens = inputText.split("\\s+");
            Person st = new Person(tokens[0]+" "+tokens[1], Integer.parseInt(tokens[2]));
            students.add(st);
        }
        Map<Integer,List<Person>> studentsByGroup1 =
                students.stream()
                .collect(groupingBy(Person::getGroup));
        studentsByGroup=studentsByGroup1;
        studentsByGroup.keySet().stream()
                .forEach(printStudents);
    }
static Consumer<Integer> printStudents = (st)->{
    String result = st+" - "+studentsByGroup.get(st).toString().replaceAll("[\\[\\]]","");
    System.out.println(result);
    };
}