package pufaDemo;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * Created by T on2019/8/9 15:55
 */
public class Fibonacci {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            BigInteger fibonacciNumber = FibonacciImpl(n);
            Instant end = Instant.now();
            long runTime = Duration.between(start, end).toMillis();
            System.out.println(fibonacciNumber + " 运行时间: " + runTime + "ms");
        }
    }

    /*private static BigInteger FibonacciImpl(int n) {
        if (n < 2) {
            return BigInteger.valueOf(n);
        }
            BigInteger[] result = new BigInteger[n + 1];
            result[0] = BigInteger.valueOf(0);
            result[1] = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++) {
                result[i] = result[i - 1].add(result[i - 2]);
            }
            return result[n];
    }*/

    private static BigInteger FibonacciImpl(int n) {
        if (n < 2) {
            return BigInteger.valueOf(n);
        }
        BigInteger FibOne = BigInteger.valueOf(0);
        BigInteger FibTwo = BigInteger.valueOf(1);
        BigInteger FinN = BigInteger.valueOf(0);
        for (int i = 2; i <= n; i++) {
            FinN = FibOne.add(FibTwo);
            FibOne = FibTwo;
            FibTwo = FinN;
        }
        return FinN;
    }
}
