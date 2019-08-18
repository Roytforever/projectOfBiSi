package pufaDemo;

import java.util.Scanner;

/**
 * 找出正整数中偶数，并输出相加后的数，要用 long.
 * Created by T on2019/8/6 9:31
 */
public class sumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        System.out.println(sumNum(number));
    }

    public static long sumNum(long number) {
        long sum = 0L;//保存number中偶数的和
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}
