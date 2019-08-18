package pufaDemo;

import java.util.Scanner;

/**
 * 输入十个数，最大数和最后一个数交换，最小树和第一个数交换
 * Created by T on2019/8/6 14:07
 */
public class swapNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        while (input.hasNext()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            int minIndex = 0, maxIndex = 0, min, max;
            min = array[minIndex];
            max = array[maxIndex];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxIndex = i;
                } else if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            if (array[0] != array[minIndex]) {
                int temp = array[0];
                array[0] = array[minIndex];
                array[minIndex] = temp;
            }
            if (array[9] != array[maxIndex]) {
                int temp = array[9];
                array[9] = array[maxIndex];
                array[maxIndex] = temp;
            }

            for (int i : array) {
                System.out.print(i + ",");
            }
        }
    }
}
