package lintCode.uglyNumber;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UglyNumberTest {

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void Test(){
        //创建uglyNumberduix
        UglyNumber un = new UglyNumber();
        //调用nthUglyNumber函数
        int result = un.nthUglyNumber(9);
        //断言，期望的结果是10
        Assert.assertEquals(10,result);
    }

    @Test
    public void Test1(){
        //创建uglyNumberduix1
        UglyNumber1 un = new UglyNumber1();
        //调用nthUglyNumber函数
        int result = un.nthUglyNumber(9);
       // System.out.println(result);
        //断言，期望的结果是10
        Assert.assertEquals(10,result);
    }
}
