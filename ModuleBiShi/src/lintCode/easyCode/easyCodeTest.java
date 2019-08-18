package lintCode.easyCode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class easyCodeTest {
    @Before
    public void init() {
        System.out.println("init...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }

    @Test
    public void digitTest() {
        //创建对象
        easyCode ec = new easyCode();
        //调用方法
        int result = ec.reverseInteger(345);
        //System.out.println(result);
        //断言
        Assert.assertEquals(543, result);
    }

    @Test
    public void lowercaseTest() {
        easyCode ec = new easyCode();
        char result = ec.lowercaseToUppercase('b');
        Assert.assertEquals('B', result);
    }

    @Test
    public void lowercaseTest2() {
        easyCode ec = new easyCode();
        String result = ec.lowercaseToUppercase2("abc123def");
        //System.out.println(result);
        Assert.assertEquals("ABC123DEF", result);
    }

    @Test
    public void maxOfArrayTest() {
        float[] array = {1.0f, 2.1f, -3.3f};
        easyCode ec = new easyCode();
        float result = ec.maxOfArray(array);
        System.out.println(result);
        Assert.assertEquals(2.1f, result, 0.1);
    }

    @Test
    public void stringToIntegerTest() {
        String str = "-123";
        int str1 = -123;
        easyCode ec = new easyCode();
        int result = ec.stringToInteger(str);
        Assert.assertEquals(str1, result);
    }

    @Test
    public void maxOfThreeNumbersTest() {
        easyCode ec = new easyCode();
        int result = ec.maxOfThreeNumbers(5, 3, 10);
        Assert.assertEquals(10, result);
    }

    @Test
    public void fibonacciTest() {
        easyCode ec = new easyCode();
        int result = ec.fibonacci(2);
        //System.out.println(result);
        Assert.assertEquals(1, result);
    }

    @Test
    public void fibonacciTest1() {
        easyCode ec = new easyCode();
        int result = ec.fibonacci(41);
        //System.out.println(result);
        Assert.assertEquals(102334155, result);
    }

    @Test
    public void sortIntegersTest() {
        int[] array = {3, 2, 1, 4, 5};
        easyCode ec = new easyCode();
        ec.sortIntegers(array);
        for (int i : array) {
            System.out.print(i + ",");
        }
    }

    @Test
    public void calculateTest() {
        easyCode ec = new easyCode();
        int result = ec.calculate(4, '*', 5);
        Assert.assertEquals(20, result);
    }

    @Test
    public void fizzBuzzTest() {
        List<String> list = Arrays.asList(new String[]{"1", "2", "fizz", "4", "buzz", "fizz",
                "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz"});
        //创建easyCode对象
        easyCode ec = new easyCode();
        //调用fizzBuzz函数
        List<String> result = ec.fizzBuzz(15);
       /* for (String s : result) {
            System.out.print(s + ",");
        }*/
        //断言
        Assert.assertArrayEquals(new List[]{list}, new List[]{result});
    }

    @Test
    public void strStrTest() {
        String str1 = "abcdabcdefg";
        String str2 = "bcd";
        //创建easyCode对象
        easyCode ec = new easyCode();
        //调用strStr函数
        int result = ec.strStr(str1, str2);
        //断言
        Assert.assertEquals(1, result);
    }

    @Test
    public void binarySearchTest() {
        int[] str = {3, 4, 5, 8, 8, 8, 8, 10, 13, 14};
        //创建easyCode对象
        easyCode ec = new easyCode();
        //调用binarySearch函数
        int result = ec.binarySearch(str, 8);
        //断言
        Assert.assertEquals(3, result);
    }

    @Test
    public void maxSubArrayTest() {
        int[] arr = {-2, 2, -3, 4, -1, 2, 1, -5, 3};
        easyCode ec = new easyCode();
        int max = ec.maxSubArray(arr);
        Assert.assertEquals(6, max);
    }
    @Test
    public void minSubArrayTest(){
        List<Integer> obj =new ArrayList<>();
        List list =Arrays.asList(1, -1, -2, 1, -4);
        obj.addAll(list);
        easyCode ec = new easyCode();
        int min = ec.minSubArray(list);
        Assert.assertEquals(-6, min);
    }

    @Test
    public void majorityNumberTest() {
        List<Integer> obj = new ArrayList<>();
        List list = Arrays.asList(1, 1, 1, 1, 2, 2, 2);
        obj.addAll(list);
        easyCode ec = new easyCode();
        int number = ec.majorityNumber1(list);
        Assert.assertEquals(1, number);
    }

    @Test
    public void twoSumTest(){
        int[] numbers={2, 7, 11, 15};
        int[] arr={0,1};
        easyCode ec = new easyCode();
        int[] result = ec.twoSum(numbers, 9);
        Assert.assertArrayEquals(arr,result);
    }
}
