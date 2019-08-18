package lintCode.mergeSortedArray;

public class mergeSorted {
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[A.length + B.length];

            while (i < A.length && j < B.length) {
                if (A[i] <= B[j]) {
                    result[k++] = A[i++];
                } else {
                    result[k++] = B[j++];
                }
            }
            //如果A B数组有一个为空
                while (j < B.length) {
                    result[k++] = B[j++];
                }
                while (i < A.length) {
                    result[k++] = A[i++];
                }
            return result;
        }
}
