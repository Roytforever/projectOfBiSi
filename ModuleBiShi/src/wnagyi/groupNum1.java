package wnagyi;

import java.util.Scanner;

/**
 * Created by T on2019/8/3 9:56
 */
public class groupNum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int[] appleNum = new int[n];
            for (int i = 0; i < n; i++) {
                appleNum[i] = input.nextInt();
            }

            int m = input.nextInt();
            int[] query = new int[m];
            for (int i = 0; i < m; i++) {
                query[i] = input.nextInt();
            }

            int[] appleSum = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += appleNum[i];
                appleSum[i] = sum;
            }

            for (int i = 0; i < m; i++) {
                System.out.println(binSearch(appleSum, query[i]) + 1);
            }
        }
        input.close();
    }

    public static int binSearch(int[] array, int k) {
        int mid = array.length / 2;
        if (k == array[mid]) {
            return mid;
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (k > array[mid]) {
                start = mid + 1;
            } else if (k < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

}
