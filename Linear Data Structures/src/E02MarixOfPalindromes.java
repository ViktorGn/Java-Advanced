import java.util.Scanner;

public class E02MarixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        String [][] m = new String[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                m[i][j]=pal(i,j);
            }
        }
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.printf("%s ", m[i][j]);
            }
            System.out.println();
        }
    }
    private static String pal(int i, int j) {
        char[] ch = new char[3];
        ch[0]=(char)((int)'a'+i);
        ch[1]=(char)((int)'a'+i+j);
        ch[2]=ch[0];
        String s = new String(ch);
        return s;
    }
}
