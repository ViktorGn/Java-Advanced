import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E08HandsOfCards {
    public static void main(String[] args) throws IOException {
        Map<String, Set<String>> hands = new LinkedHashMap<>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = console.readLine();
            if (input.equals("JOKER")) break;
            String[] currentHand = input.split(":|,");
            Set<String> cardSet = hands.get(currentHand[0]);
            if (cardSet == null) cardSet = new HashSet<String>();
            for (int i = 1; i < currentHand.length; i++) {
                cardSet.add(currentHand[i].trim());
            }
            hands.put(currentHand[0], cardSet);
        }
        for (String e : hands.keySet()){
            System.out.printf("%s: %d%n",e, handsValue(hands.get(e)));
        }
    }

    private static Integer handsValue(Set<String> strings) {
        int result = 0;
        for (String e : strings) {
            result+= power(e.substring(0,e.length()-1))* type(e.substring(e.length()-1));
        }
        return result;
    }

    private static Integer power(String s) {
        int result = 0;
        switch (s) {
            case "J": result= 11;
                break;
            case "Q": result= 12;
                break;
            case "K": result= 13;
                break;
            case "A": result= 14;
                break;
            default: result=Integer.parseInt(s);
            break;
        }
        return result;
        }

    private static Integer type(String s) {
        int result = 0;
        switch (s) {
            case "S": result= 4;
            break;
            case "H": result= 3;
            break;
            case "D": result= 2;
            break;
            case "C": result= 1;
            break;
        }
        return result;
    }
}

