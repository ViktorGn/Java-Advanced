import java.util.Scanner;

public class E06HitTheTarget {
    public static void main(String[] args) {
        final int MAX_NUM=20;
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        for (int i = 1; i <=MAX_NUM ; i++) {
            for (int j = 1; j <=MAX_NUM ; j++) {
                if ((i+j)==target) System.out.println(i+" + "+j+" = "+target);
            }
        }
        for (int i = 1; i <=MAX_NUM ; i++) {
            for (int j = 1; j <=MAX_NUM ; j++) {
                if ((j-i)==target) System.out.println(j+" - "+i+" = "+target);
            }
        }
    }
}
