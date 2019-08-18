package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/6 10:38
 */
public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isPrime(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % Math.sqrt(i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
