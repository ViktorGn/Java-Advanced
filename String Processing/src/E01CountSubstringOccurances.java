import java.util.Scanner;

public class E01CountSubstringOccurances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toUpperCase();
        String target = scanner.nextLine().toUpperCase();

        int index=0;
        int targetPostion = text.indexOf(target, index);
        int occurances = 0;

        while (targetPostion>=0) {
            occurances++;
            index = targetPostion+1;
            targetPostion = text.indexOf(target, index);
        }
        System.out.println(occurances);
    }
}