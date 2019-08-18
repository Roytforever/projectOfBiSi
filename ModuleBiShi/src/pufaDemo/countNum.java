package pufaDemo;

import java.util.Scanner;

/**
 * 输入 n 和 b , 找出 1 到 n 中被 b 整除的个数.
 * Created by T on2019/8/6 9:44
 */
public class countNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b = input.nextInt();
        System.out.println(countOfNumber(n, b));
    }

    public static int countOfNumber(int n, int b) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % b == 0) {
                count++;
            }
        }
        return count;
    }
}
