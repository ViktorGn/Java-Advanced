import java.util.Scanner;

public class E10Xbits {
    public static final int LINES = 8;
    public static int xbits = 0;
    public static void main(String[] args) {
        String [] nb = new String[LINES];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <LINES ; i++) {
            int temp=scanner.nextInt();
            scanner.nextLine();
            nb[i] = String.format("%32s", Integer.toBinaryString(temp)).replace(' ', '0');
        }
        for (int i = 0; i <=LINES-3 ; i++) { //row
            for (int j = 0; j <=32-3 ; j++) { //col
                findXbits(nb,i,j);
            }
        }

        //for (int i = 0; i <8 ; i++) {
        //    System.out.println(nb[i]);
        //}
        System.out.println(xbits);
    }

    private static void findXbits(String[] nb, int i, int j) {
        if ((nb[i].indexOf("101",j)==j)&&
            (nb[i+1].indexOf("010",j)==j)&&
            (nb[i+2].indexOf("101",j)==j))
            xbits++;
    }
}
