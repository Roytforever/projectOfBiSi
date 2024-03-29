package LeetCodeNew;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by T on2019/8/3 19:24
 */
public class twoSum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = input.nextInt();
            }
            int target = input.nextInt();
            int[] result = new int[2];
            int[] ints = twoSum(nums, target);
            System.out.println("[" + ints[0] + "," + ints[1] + "]");
        }
        input.close();
    }

    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int var = target - nums[i];
            if (map.containsKey(var)) {
                return new int[]{map.get(var), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
