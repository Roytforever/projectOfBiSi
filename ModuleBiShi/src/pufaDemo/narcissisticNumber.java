package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/12 16:35
 */
public class narcissisticNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        while (input.hasNext()) {
            int n = input.nextInt();
            for (int i = 0; i < 10; i++) {
                array[i] = (int) Math.pow(10, n);
            }
            for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
                int narNumber = printNarNumber(i, n);
                if (narNumber != 0) {
                    System.out.println(narNumber);
                }
            }
        }
    }

    public static int printNarNumber(int num, int n) {
        int sum = 0;
        int m = num;
        while (m > 0) {
            sum += Math.pow(m % 10, n);
            m /= 10;
        }
        if (num == sum) {
            return num;
        } else
            return 0;
    }
}
