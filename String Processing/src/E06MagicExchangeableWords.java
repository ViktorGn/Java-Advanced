import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class E06MagicExchangeableWords {
    public static void main(String[] args) throws IOException {
        Map<Character, Character> map = new HashMap<>();
        Boolean isTrue = true;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split("\\s+");

        String firstWord = input[0];
        String secondWord = input[1];
        if (firstWord.length()>secondWord.length()) {
            firstWord= input[1];
            secondWord = input[0];
        }

        int minLenght = Math.min(firstWord.length(), secondWord.length());
        int maxLenght = Math.max(firstWord.length(), secondWord.length());

        for (int a = 0; a < minLenght; a++) {
            if (!map.containsKey(firstWord.charAt(a))) {
                if (map.containsValue(secondWord.charAt(a))) {
                    isTrue = false;
                    break;
                } else {
                    map.put(firstWord.charAt(a), secondWord.charAt(a));
                }
            } else if (map.get(firstWord.charAt(a)).compareTo(secondWord.charAt(a))!=0) {
                isTrue = false;
                break;
            }
            }

        if (!(minLenght==maxLenght)) {
            String delta = "";
            if (firstWord.length() > secondWord.length()) {
                delta = firstWord.substring(minLenght, maxLenght);
            } else {
                delta = secondWord.substring(minLenght, maxLenght);
            }

            for (int j = 0; j < delta.length(); j++) {
                if (!map.containsValue(delta.charAt(j))) {
                    isTrue = false;
                    break;
                }
            }
        }
        System.out.println(isTrue);
    }
}