package pufaDemo;


/**
 * Created by T on2019/8/13 15:54
 */
public class singleNumberNums {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 4, 5};
        int singleNumber = singleNumber(array);
        System.out.println(singleNumber);
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
