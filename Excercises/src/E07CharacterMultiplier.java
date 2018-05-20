import java.util.Scanner;

public class E07CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] str = scanner.nextLine().split("\\s+");
        int l0 = str[0].length();
        int l1 = str[1].length();
        int lmax = Math.max(l0,l1);
        int sum = 0;
        for (int i = 0; i <lmax ; i++) {
            if ((i<l0) && (i<l1)){
                sum+= str[0].charAt(i) * str[1].charAt(i);
            } else if (i<l0) {
                sum+= str[0].charAt(i);
                } else {
                    sum+= str[1].charAt(i);
                }
        }
        System.out.println(sum);
    }
}