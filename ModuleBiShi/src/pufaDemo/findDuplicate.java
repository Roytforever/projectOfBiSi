package pufaDemo;

import java.util.*;

/**
 * Created by T on2019/8/14 15:02
 */
public class findDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }
        Integer[] integers = new Integer[list.size()];
        list.toArray(integers);
        int duplicateImpl = findDuplicateImpl(integers);
        System.out.println(duplicateImpl);
    }

    public static int findDuplicateImpl(Integer[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }
}
