import java.io.*;
import java.util.ArrayDeque;

public class E09MaximumElement {
    public static void main(String[] args) throws IOException {
//Input
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in),10000000);
        int steps = Integer.parseInt(in.readLine());
//        ArrayDeque <Integer> lifo = new ArrayDeque<>(steps);
        int lifo[] = new int[steps];
        int maxLifo[] = new int[steps];
        int currentMax = Integer.MIN_VALUE;
        int index =0;
        maxLifo[0]=currentMax;
        int zeroCode = (int) '0';
        StringBuilder command = new StringBuilder(16);
        int element=0;
        for (int i = 0; i <steps ; i++) {
            command.setLength(0);
            command.append(in.readLine());
            switch ((int)command.charAt(0)-zeroCode){
                case 1:
                    index++;
                    element =Integer.parseUnsignedInt(command.substring(2).toString());
                    lifo[index]=element;
                    if (element>currentMax) {
                        currentMax=element;
                    };
                    maxLifo[index]=currentMax;
                    break;
                case 2:
                    index--;
                    currentMax=maxLifo[index];
                    break;
                default:
                    System.out.println(currentMax);
            }
        }
    }
}
