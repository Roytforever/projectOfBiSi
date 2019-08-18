package lintCode.digitCounts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UglyNumberTest {

    /**
     * 初始化方法：
     *  用于资源申请，所有测试方法在执行之前都会先执行该方法
     */



@Before
    public void init(){
        System.out.println("init:..");
    }

    /**
     * 释放资源方法：
     *  在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }

    /**
     * 计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0~9 的一个值。
     */
    @Test
    public void digitCountsTest(){
        //创建Solution对象
        Solution so = new Solution();
        //调用digitCounts方法
        int result = so.digitCounts(1, 12);
        //断言，结果是5
        Assert.assertEquals(5,result);
    }
}
