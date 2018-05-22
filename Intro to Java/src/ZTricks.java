import java.math.BigDecimal;
import java.math.BigInteger;

public class ZTricks {
    public static void main(String[] args) throws InterruptedException {
        BigInteger m[] = new BigInteger[Integer.MAX_VALUE];
        StringBuilder message = new StringBuilder();
        message.setLength(0); //clear the string for next message

    }

    private static void tmo() throws InterruptedException {
        Thread.sleep(200);
    }

    private static void err() {
        throw new Error();
    }

    private static void oddEven(int a, int b, StringBuilder m) { //pass object by reference (copy)
        m.append("both are even");
    }
}
