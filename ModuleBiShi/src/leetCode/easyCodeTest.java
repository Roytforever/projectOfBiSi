package leetCode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by T on2019/7/29 11:32
 */
public class easyCodeTest {

    easyCode ec = new easyCode();

    @Before
    public void init() {
        System.out.println("init...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }

    @Test
    public void replaceSpaceTest() {
        String str = "We Are Happy";
        String str1 = "We%20Are%20Happy";
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        String result = ec.replaceSpace(sb);

        Assert.assertEquals(str1, result);
    }

    @Test
    public void sumOfEvenTest(){
        long even = ec.sumOfEven(5548L);
        Assert.assertEquals(12,even);
    }

    @Test
    public void numCountTest(){
        int count = ec.numCount(10, 2);
        Assert.assertEquals(5,count);
    }

    @Test
    public void numMethodTest(){
        long result = ec.numMethod(4);
        Assert.assertEquals(5,result);
    }
}
