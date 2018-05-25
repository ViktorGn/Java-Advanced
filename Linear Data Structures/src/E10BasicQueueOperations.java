import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class E10BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String[] input = console.readLine().split("\\s+");
        int numElements = Integer.parseInt(input[0]);
        int elementsToRemove = Integer.parseInt(input[1]);
        int presentElement = Integer.parseInt(input[2]);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        String[] elements = console.readLine().split("\\s+");
        for (int i = 0; i < numElements; i++) {
            q.add(Integer.parseInt(elements[i]));
        }

        for (int a = 0; a < elementsToRemove; a++) {
            q.remove();
        }

        int min = Integer.MAX_VALUE;

        if (q.contains(presentElement)){
            System.out.println("true");
        } else if (q.isEmpty()){
            System.out.println("0");
        }  else {
            for (int a = 0; a < q.size(); a++) {
                if (q.getFirst() < min){
                    min = q.getFirst();
                    q.remove();
                    a=-1;
                }
            }
            System.out.println(min);
        }
    }
}
