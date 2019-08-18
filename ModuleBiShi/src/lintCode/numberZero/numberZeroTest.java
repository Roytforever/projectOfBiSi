package lintCode.numberZero;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class numberZeroTest {

    /**
     * 初始化方法：
     *  用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /**
     * 释放资源方法：
     *  在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }
    @Test
    public void countZero(){
        //创建numberZero对象
        numberZero n = new numberZero();
        //调用trailingZero方法
        long result = n.trailingZero(25);
        //System.out.println(result);
        //断言，结果是6
        Assert.assertEquals(6,result);
    }
}
