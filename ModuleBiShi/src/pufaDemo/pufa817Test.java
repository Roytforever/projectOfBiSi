package pufaDemo;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by T on2019/8/17 22:48
 */
public class pufa817Test {
    @Test
    public void isAllNumTest(){
        String str="123123";
        pufa817 pu = new pufa817();
        boolean allNumber = pu.isAllNumber(str);
        Assert.assertEquals(true,allNumber);
        System.out.println();
    }

    @Test
    public void MatrixTest(){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1={{1,4,7},{2,5,8},{3,6,9}};
        pufa817 pu =new pufa817();
        int[][] matrix = pu.Matrix(arr);
        Assert.assertArrayEquals(arr1,matrix);
    }
}
