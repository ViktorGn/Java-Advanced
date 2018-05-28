import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E02SetsOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> setA=new LinkedHashSet<>();
        Set<Integer> setB=new LinkedHashSet<>();
        String line1=console.readLine();
        Scanner scanner = new Scanner(line1);
        int setAsize = scanner.nextInt();
        int setBsize = scanner.nextInt();
        for (int i = 0; i <setAsize ; i++) {
            setA.add(Integer.parseInt(console.readLine()));
        }
        for (int i = 0; i <setBsize ; i++) {
            setB.add(Integer.parseInt(console.readLine()));
        }

        for (Integer e:setA){
            if (setB.contains(e)) System.out.printf("%d ",e);;
        }
        }
    }