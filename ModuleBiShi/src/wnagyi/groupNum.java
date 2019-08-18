package wnagyi;

import java.util.Scanner;

/**
 * Created by T on2019/8/3 9:56
 */
public class groupNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int[] appleNums = new int[n];
            for (int i = 0; i < n; i++) {
                appleNums[i] = input.nextInt();
            }
            int m = input.nextInt();
            int[] query = new int[m];
            for (int i = 0; i < m; i++) {
                query[i] = input.nextInt();
            }
            int[] leftSum = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += appleNums[i];
                leftSum[i] = sum;
            }
            for (int i = 0; i < m; i++) {
                System.out.println(binSearch(leftSum, query[i]) + 1);
            }
        }
    }

    private static int binSearch(int[] array, int k) {
        int mid = array.length / 2;
        if (k == array[mid]) {
            return mid;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;//支持指针和迭代器、不会出现溢出
            if (k < array[mid]) {
                end = mid - 1;
            } else if (k > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
