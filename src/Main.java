import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Fibonacci();
    }

    public static void Fibonacci() {
        int n = 100; // Number of Fibonacci numbers to generate
        BigInteger[] fibonacci = new BigInteger[n];

        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci[" + i + "] = " + fibonacci[i]);
        }
    }
}