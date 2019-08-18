package Sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortTest {
    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }
    @Test
    public void bubbleTest(){
        //待排序数组
        int[] array={1,3,2,5,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={1 ,2 ,3 ,4 ,5, 7 ,9 ,11 ,14 ,15, 19 };
        //创建bubble对象
        Sort so =new Sort();
        //调用bubbleSort函数
        int[] result = so.bubbleSort(array);
        //断言
        Assert.assertArrayEquals(array1,result);
    }

    @Test
    public void selectTest(){
        //待排序数组
        int[] array={1,3,2,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={1 ,2 ,3 ,4 , 7 ,9 ,11 ,14 ,15, 19 };
        //创建bubble对象
        Sort so =new Sort();
        //调用selctionSort函数
        int[] result = so.selctionSort(array);
        //断言
        Assert.assertArrayEquals(array1,result);

    }

    @Test
    public void insertionTest(){
        //待排序数组
        int[] array={1,3,2,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={1 ,2 ,3 ,4 , 7 ,9 ,11 ,14 ,15, 19 };
        //创建Sort对象
        Sort so = new Sort();
        //调用insertionSort函数
        int[] result = so.insertionSort(array);
       /* for (int i : result) {
            System.out.print(i + ",");
        }*/
        //断言
        Assert.assertArrayEquals(array1,result);
    }


    @Test
    public void shellTest(){
        //待排序数组
        int[] array={1,3,2,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={1 ,2 ,3 ,4 , 7 ,9 ,11 ,14 ,15, 19 };
        //创建Sort对象
        Sort so = new Sort();
        //调用shellSort函数
        int[] result = so.shellSort(array);
        //断言
        Assert.assertArrayEquals(array1,result);
    }

    @Test
    public void shellTest1(){
        //待排序数组
        int[] array={1,3,2,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={1 ,2 ,3 ,4 , 7 ,9 ,11 ,14 ,15, 19 };
        //创建Sort对象
        Sort so = new Sort();
        //调用shellSort函数
        int[] result = so.shellSort1(array);
       /* for (int i : result) {
            System.out.println(i);
        }*/
        //断言
        Assert.assertArrayEquals(array1,result);
    }

    @Test
    public void quickTest(){
        //待排序数组
        int[] array={20,3,2,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={2 ,3 ,4 , 7 ,9 ,11 ,14 ,15, 19,20 };
        //创建Sort对象
        Sort so = new Sort();
        //调用shellSort函数
        int[] result = so.quickSort(array,0,array.length-1);
       /* for (int i : result) {
            System.out.print(i + ",");
        }*/
        //断言
        Assert.assertArrayEquals(array1,result);
    }

    @Test
    public void heapTest(){
        //待排序数组
        int[] array={20,3,2,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={20,19,15,14,11,9,7,4,3,2 };
        //创建Sort对象
        Sort so = new Sort();
        //调用minHeapSort函数
        int[] result = so.minHeapSort(array, array.length);
       /* for (int i : result) {
            System.out.print(i + ",");
        }*/
        //断言
        Assert.assertArrayEquals(array1,result);
    }

    @Test
    public void mergeTest(){
        //待排序数组
        int[] array={20,3,2,7,4,9,11,19,15,14};
        //期待结果
        int[] array1={2 ,3 ,4 , 7 ,9 ,11 ,14 ,15, 19,20};
        //创建Sort对象
        Sort so = new Sort();
        //调用minHeapSort函数
        int[] result = so.mergeSort(array);
       /* for (int i : result) {
            System.out.print(i + ",");
        }*/
        //断言
        Assert.assertArrayEquals(array1,result);
    }
}
