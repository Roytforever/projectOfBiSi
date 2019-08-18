package lintCode.easyCode.sort;

public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here
        quickSort(A, 0, A.length - 1, 15);
    }

    /**
     * 快速排序的模板方法
     * @param a
     * @param left
     * @param right
     * @param THRESHOLD 阈值， 主要是为了在小数组的情况下选择插入排序， 效率更高， 优化性能15%
     */
    protected static void quickSort(int[] a, int left, int right, int THRESHOLD){
        if(right - left >= THRESHOLD){
            int pivot = median3(a, left, right);

            int i = left; int j = right - 1;
            for(;;){
                while(a[++i] < (pivot)){}
                while(a[--j] > (pivot)){}
                if(i < j){
                    compareAndSwap(a, i, j);
                }else{
                    break;
                }
            }

            compareAndSwap(a, i, right - 1);
            quickSort(a, left, i - 1, THRESHOLD);
            quickSort(a, i + 1, right, THRESHOLD);
        }else{
            //插入排序
            insertSort(a, left, right);
        }
    }


    protected static void insertSort(int[] a, int left, int right){
        int j;
        for(left += 1; left <= right; left++){
            int tmp = a[left];
            for(j = left; j > 0 && tmp < a[j - 1]; j--){
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }

    /**
     * 平均的取出一个中位数
     * @param a 数组
     * @param left 左边的下标
     * @param right 右边的下标
     */
    private static int median3(int[] a, int left, int right){
        int center = (left + right) >> 1;
        if(a[center] < a[left]) {
            compareAndSwap(a, left, center);
        }
        if(a[right] < a[left]) {
            compareAndSwap(a, left, right);
        }
        if(a[right] < a[center]) {
            compareAndSwap(a, center, right);
        }

        /**
         * 首先确保了left, center, right 的值得比较， 然后将中值的节点放置right-1的位置
         */
        compareAndSwap(a, center, right - 1);
        /**
         * 返回中值的数据
         */
        return a[right - 1];
    }

    /**
     * 比较和替换， 这里
     * @param a
     * @param left
     * @param right
     * TODO:: 这里可以用CAS原子性操作
     */
    private static void compareAndSwap(int[] a, int left, int right){
        int tmp = a[left];
        a[left] = a[right];
        a[right] = tmp;
    }
}
