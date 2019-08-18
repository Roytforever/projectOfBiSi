package lintCode.mergeSortedArray;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class mergeSortedTest {
    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }
    @Test
    public void test(){
        int [] array1={1,2,3,4};
        int [] array2={2,4,5,6};
        int [] array3={1,2,2,3,4,4,5,6};
        //创建mergeSorted对象
        mergeSorted ms = new mergeSorted();
        //调用mergeSortedArray函数
        int[] result = ms.mergeSortedArray(array1, array2);
        for (int i : result) {
            System.out.print(i + ",");
        }
        //断言
        Assert.assertArrayEquals(array3,result);
    }
}
