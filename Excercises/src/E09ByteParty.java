import java.util.Scanner;

public class E09ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCount = Integer.parseInt(scanner.nextLine());
        int[] n = new int[nCount];
        for (int i = 0; i < nCount; i++) {
            n[i] = Integer.parseInt(scanner.nextLine());
        }
        ;
        String command = scanner.nextLine();
        while (!command.equals("party over")) {
            String[] tokens = command.split("\\s+");
            int commandNum = Integer.parseInt(tokens[0]);
            int position = Integer.parseInt(tokens[1]);
            switch (commandNum) {
                case -1:
                    xOR(n, nCount, position);
                    break;
                case 0:
                    zero(n, nCount, position);
                    break;
                case 1:
                    one(n, nCount, position);
                    break;
            }
//            for (int i = 0; i < nCount; i++) {
//                System.out.printf("%8s%n",Integer.toBinaryString(n[i]));
//            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < nCount; i++) {
            System.out.println(n[i]);
        }
    }

    private static void xOR(int[] n, int count, int position) {
        int mask = 1 << position;
        for (int i = 0; i < count; i++) {
            n[i] = n[i] ^ mask;
        }
    }

    private static void zero(int[] n, int count, int position) {
        int mask = 1 << position;
        mask = ~mask;
        for (int i = 0; i < count; i++) {
            n[i] = n[i] & mask;
        }
    }

    private static void one(int[] n, int count, int position) {
        int mask = 1 << position;
        for (int i = 0; i < count; i++) {
            n[i] = n[i] | mask;
        }
    }
}