import java.util.Scanner;

public class E05OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("\\s+");
        int l = s.length;
        StringBuilder message = new StringBuilder();
        if ((l == 0) || (l % 2 != 0)) {
            System.out.println("invalid length");
            return;
        }
        for (int i = 0; i < l; i = i + 2) {
            int a = Integer.parseInt(s[i]);
            int b = Integer.parseInt(s[i+1]);
            oddEven(a, b, message);
            System.out.println(a + ", " + b + " -> " + message.toString());
            message.setLength(0);
        }
    }

    private static void oddEven(int a, int b, StringBuilder m) {
        int aType = a % 2;
        int bType = b % 2;
        int combination = aType + bType;
        switch (combination) {
            case 0:
                m.append("both are even");
                break;
            case 1:
                m.append ("different");
                break;
            case 2:
                m.append("both are odd");
                break;
        }
    }
}
