import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class E11PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        List<String> guests = new LinkedList<>(Arrays.asList(input.readLine().split("\\s+")));

        String command = input.readLine();


        while (!command.equals("Party!")) {
            String[] commandArr = command.split("\\s+");
            String action = commandArr[0];
            String filter = commandArr[1];
            String value = commandArr[2];

            Predicate<String> isEligible = getTest(value, filter);

            switch (action) {
                case "Double":
                    doubleGuests(guests, isEligible);
                    break;
                case "Remove":
                    removeGuests(guests, isEligible);
            }
            command = input.readLine();
        }

        System.out.println(
                guests.size() > 0 ?
                        String.format("%s are going to the party!", guests.toString().replaceAll("[\\[\\]]", "")) :
                        "Nobody is going to the party!"
        );
    }

    private static void removeGuests(List<String> guestList, Predicate<String> isEligible) {
        for (int i = guestList.size() - 1; i >= 0; i--) {
            String guest = guestList.get(i);
            if (isEligible.test(guest)) {
                guestList.remove(i);
            }
        }
    }

    private static void doubleGuests(List<String> guestList, Predicate<String> isEligible) {
        for (int i = guestList.size() - 1; i >= 0; i--) {
            String guest = guestList.get(i);
            if (isEligible.test(guest)) {
                guestList.add(i, guest);
            }
        }
    }

    private static Predicate<String> getTest(String value, String filter) {
        switch (filter) {
            case "StartsWith":
                return s -> s.startsWith(value);
            case "EndsWith":
                return s -> s.endsWith(value);
            case "Length":
                return s -> s.length() == Integer.parseInt(value);
        }

        return null;
    }
}
