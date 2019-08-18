package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/13 10:34
 */
public class isPerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
           /* if (isPerfectSquareNumber(n)) {
                System.out.println(n + " is a perfect square number.");
            } else {
                System.out.println(n + " is not a perfect square number.");
            }*/
            if (isPerfectSquareNumber2(n)) {
                System.out.println(n + " is a perfect square number.");
            } else {
                System.out.println(n + " is not a perfect square number.");
            }
        }
    }

    public static boolean isPerfectSquareNumber(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public static boolean isPerfectSquareNumber2(int num) {
        long start = 1;
        long end = num;
        long mid = (end - start) / 2 + start;
        while (start <= end) {
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else if (mid * mid < num) {
                start = mid + 1;
            }
            mid = (end - start) / 2 + start;
        }
        return false;
    }
}
