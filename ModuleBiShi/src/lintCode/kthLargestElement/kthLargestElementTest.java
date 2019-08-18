package lintCode.kthLargestElement;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class kthLargestElementTest {

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
        int[] nums ={9,3,2,4,8};
        //创建kthLargestElement对象
        kthLargestElement ke = new kthLargestElement();
        //调用方法
        int result = ke.kthLargestElement(3, nums);
        // System.out.println(result);
        //断言
        Assert.assertEquals(4,result);
    }
}
