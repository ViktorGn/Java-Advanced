import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class E11Robotics {

    public static void main(String[] args) throws IOException {
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        String[] robotsTokens = consoleInput.readLine().split(";");
        String[] robots = new String[robotsTokens.length];
        int[] processTime = new int[robotsTokens.length];
        int[] robotsCounter = new int[robotsTokens.length];

        for (int i = 0; i < robotsTokens.length; i++) {
            String[] robotsToken = robotsTokens[i].split("-");
            robots[i] = robotsToken[0];
            processTime[i] = Integer.parseInt(robotsToken[1]);
        }

        long seconds = HMStoSeconds(consoleInput.readLine());

        ArrayDeque<String> fifo = new ArrayDeque<>();

        String product = consoleInput.readLine();
        while (!product.equals("End")) {
            fifo.offer(product);
            product = consoleInput.readLine();
        }

        while (!fifo.isEmpty()) {
            seconds++;
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] > 0) {
                    robotsCounter[i]--;
                }
            }
            String currentProduct = fifo.poll();
            boolean isProductTaken = false;
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] == 0) {
                    robotsCounter[i] = processTime[i];
                    isProductTaken = true;
                    System.out.printf("%s - %s [%s]%n", robots[i], currentProduct, secondsToHMS(seconds));
                    break;
                }
            }
            if (!isProductTaken) {
                fifo.offer(currentProduct);
            }
        }
    }

    private static long HMStoSeconds(String input) {
        String[] time = input.split(":");
        long h = Integer.parseInt(time[0]) * 60 * 60;
        long m = Integer.parseInt(time[1]) * 60;
        long sec = Integer.parseInt(time[2]);
        return h + m + sec;
    }

    public static String secondsToHMS(long seconds) {
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}

