package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/16 9:56
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            if (prime(n)) {
                System.out.println(n + ": primeNumber.");
            } else {
                System.out.println(n + ": is not primeNumber.");
            }
        }
       input.close();
   }

    public static boolean prime(int num) {
        if (num == 1) {
            return false;
        } else if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
