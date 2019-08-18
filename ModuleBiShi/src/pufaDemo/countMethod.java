package pufaDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 爬一个或者两个台阶，输入 1 <= n < 90 的数字为台阶数，
 * 以输入 0 作为结束标志，输出n个台阶共有多少种上楼方式.
 * Created by T on2019/8/6 9:48
 */
public class countMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lists = new ArrayList();
        while (input.hasNext()) {
            int list = input.nextInt();
            if (list == 0) {
                break;
            } else {
                lists.add(list);
            }
        }
        for (Integer integer : lists) {
            System.out.println(countOfMethod(integer));
        }
    }

    public static int countOfMethod(int n) {
        if (n <= 2) {
            return n;
        }
        if (n > 2) {
            int[] array = new int[n + 1];
            array[0] = 0;
            array[1] = 1;
            array[2] = 2;
            for (int i = 3; i <= n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            return array[n];
        }
        return 0;
    }
}
