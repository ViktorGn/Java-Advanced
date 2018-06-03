import java.util.Scanner;

public class E02SumBigNumbers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringBuilder operand1 = new StringBuilder();
        operand1.append(scanner.nextLine().replaceAll("^0+(?=\\d)", ""));
    StringBuilder opperand2 = new StringBuilder();
        opperand2.append(scanner.nextLine().replaceAll("^0+(?=\\d)", ""));

        int padding = Math.abs(opperand2.length() - operand1.length());

        while (padding > 0) {
            if (operand1.length() <= opperand2.length())
                operand1.insert(0, "0");
             else
                opperand2.insert(0, "0");
            padding--;
        }

    StringBuilder result = new StringBuilder();
    int add = 0;
        for (int i = operand1.length() - 1; i >= 0; i--) {
            int digit1 = Integer.parseInt(operand1.substring(i, i+1));
            int digit2 = Integer.parseInt(opperand2.substring(i, i+1));
            int carry = (digit1 + digit2 + add) % 10;
            result.append(carry);
            add = (digit1 + digit2 + add) / 10;
        }
        if (add > 0){
        result.append(add);
    }

        result.reverse();

        System.out.println(result);
    }
}
