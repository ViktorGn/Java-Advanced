import java.util.*;

public class E10PopulationCounter {

    public static void main(String[] args) {
        Map<String,Map<String,Long>> cities = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split("\\|");
        while (!inputLine[0].equals("report")) {
            if (!cities.containsKey(inputLine[1])){
                cities.put(inputLine[1], new LinkedHashMap<>());
            }
            cities.get(inputLine[1]).put(inputLine[0], Long.parseLong(inputLine[2]));
            inputLine = scanner.nextLine().split("\\|");
        }
        cities.entrySet()
                .stream()
                .sorted((e1,e2)->Long.compare(e2.getValue()
                                .values()
                                .stream()
                                .mapToLong(е->е.longValue())
                                .sum(),
                        e1.getValue()
                                .values()
                                .stream()
                                .mapToLong(е->е.longValue())
                                .sum()))
                .forEach(a->{
                    System.out.println(a.getKey()+" (total population: " + a.getValue()
                            .values()
                            .stream()
                            .mapToLong(e->e.longValue())
                            .sum()+")");
                    a.getValue()
                            .entrySet()
                            .stream()
                            .sorted((b1,b2)->Long.compare(b2.getValue(), b1.getValue()))
                            .forEach(b->{
                                System.out.println("=>" +b.getKey()+": "+b.getValue());
                            });
                });
    }
}
