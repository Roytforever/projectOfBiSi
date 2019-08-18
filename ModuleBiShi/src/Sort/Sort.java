package Sort;

import java.util.Arrays;

/**
 * 排序算法
 */
public class Sort {

    /**
     * 交换两个元素
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 冒泡排序：按照升序排列
     *
     * @param array
     * @return
     */
    public int[] bubbleSort(int[] array) {
        boolean flag;
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {                //外层循环一次为一趟排序
            flag = false;                                       // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            for (int j = 0; j < array.length - 1 - i; j++) {    //内层循环一次为一次相邻比较
                if (array[j + 1] < array[j]) {
                   /* int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;*/
                    swap(array, j, j + 1);
                    flag = true; //只要有发生了交换，flag就置为true
                }
            }
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
            if (!flag)
                break;
        }
        return array;
    }

    /**
     * 选择排序，升序
     *
     * @param array
     * @return
     */
    public int[] selctionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {  //找到最小的数
                    minIndex = j;     //将最小数的索引保存
                }
            }
            //交换
            /*int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;*/
            swap(array,minIndex,i);

        }
        return array;
    }

    /**
     * 插入排序 升序
     *
     * @param array
     * @return
     */
    public int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    /*int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;*/
                    swap(array,j,j-1);
                } else {
                    break;//不需要交换
                }
            }
        }
        return array;
    }

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public int[] shellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public int[] shellSort1(int[] array) {
        int temp = 0;
        int incre = array.length;
        if (array.length == 0)
            return array;
        while (true) {
            incre = incre / 2;

            for (int i = 0; i < incre; i++) {    //根据增量分为若干子序列

                for (int j = i + incre; j < array.length; j++) {

                    for (int k = j; k > i; k -= incre) {
                        if (array[k] < array[k - incre]) {
                          /*  temp = array[k - incre];
                            array[k - incre] = array[k];
                            array[k] = temp;*/
                          swap(array,k-incre,k);
                        } else {
                            break;
                        }
                    }
                }
            }
            if (incre == 1) {
                break;
            }
        }
        return array;
    }

    /**
     * 快速排序
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public int[] quickSort(int[] array, int start, int end) {
        if (array.length == 0 || start >= end)
            return array;
        int i = start;
        int j = end;
        int key = array[start];//选择第一杆数为key
        while (i < j) {
            while (i < j && array[j] >= key)    //从右向左找第一个小于key的值
                j--;
            if (i < j) {
                array[i] = array[j];
                i++;
            }

            while (i < j && array[i] < key) //从左向右找第一个大于key的值
                i++;
            if (i < j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = key;
        quickSort(array, start, i - 1);//递归调用
        quickSort(array, i + 1, end);//递归调用

        return array;
    }

    /**
     * 构建最小堆
     *
     * @param array
     * @param n
     */
    public static void makeMinHeap(int[] array, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            minHeapFixdown(array, i, n);
        }
    }

    /**
     * 最小堆
     *
     * @param array
     * @param i
     * @param n
     * @return
     */
    //从i节点开始调整,n为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2
    public static void minHeapFixdown(int[] array, int i, int n) {
        int j = 2 * i + 1;
        int temp = 0;
        while (j < n) {
            //在左右子节点中寻找最小的
            if (j + 1 < n && array[j + 1] < array[j]) {
                j++;
            }
            if (array[i] <= array[j])
                break;
            //较大节点下移
          /*  temp = array[i];
            array[i] = array[j];
            array[j] = temp;*/
          swap(array,i,j);

            i = j;
            j = 2 * i + 1;
        }
    }

    /**
     * 堆排序,降序排序
     *
     * @param array
     * @param n
     * @return
     */
    public static int[] minHeapSort(int[] array, int n) {
        int temp = 0;
        makeMinHeap(array, n);//构建最小堆

        for (int i = n - 1; i > 0; i--) {
           /* temp = array[0];
            array[0] = array[i];
            array[i] = temp;*/
           swap(array,0,i);
            minHeapFixdown(array, 0, i);//调整堆
        }
        return array;
    }

    /**
     * 归并排序
     * @param array
     * @return
     */
    public static int[] mergeSort(int[] array){
        if (array.length < 2)
            return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left,int[] right){
        int[] result = new int[left.length + right.length];
        for (int index = 0,i=0,j=0; index<result.length; index++){
            if (i>=left.length)
                result[index] = right[j++];
            else if (j>=right.length)
                result[index] = left[i++];
            else if(left[i]>right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }
}