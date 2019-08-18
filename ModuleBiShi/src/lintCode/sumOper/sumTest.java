package lintCode.sumOper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class sumTest {
    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void aplusbTest(){
        //创建sum对象
        sum sum = new sum();
        //调用aplusb方法
        int result = sum.aplusb(1,2);
        //断言，结果是3
        Assert.assertEquals(3,result);
    }
}
