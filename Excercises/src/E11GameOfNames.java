import java.util.Scanner;

public class E11GameOfNames {
    public static void main(String[] args) {
        String winner = new String();
        int highScore = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        int pcount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <pcount ; i++) {
            String name = scanner.nextLine(); //read the name
            int iscore = Integer.parseInt(scanner.nextLine());//read initial score
            int score = iscore;
            for (int j = 0; j <name.length() ; j++) {
                int chVal=(int) name.charAt(j);
                if (chVal%2 !=0) chVal *=-1;
                score+=chVal;
            }
            if (score>highScore) {
                highScore=score;
                winner=name;
            }
        }
        System.out.printf("The winner is %s - %d points",winner, highScore);
    }
}
