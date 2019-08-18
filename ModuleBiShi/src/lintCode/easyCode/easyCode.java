package lintCode.easyCode;

import java.util.*;

public class easyCode {
    /**
     * 反转一个只有3位数的整数。
     *
     * @param number:a 3-digit number.
     * @return Reversed number.
     */
    public int reverseInteger(int number) {
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = number / 100;
        return a * 100 + b * 10 + c;
    }

    /**
     * 将一个字符由小写字母转换为大写字母
     *
     * @param character:a character
     * @return
     */
    public char lowercaseToUppercase(char character) {
        //
        //return (char)(character-32);
        return Character.toUpperCase(character);
    }


    /**
     * 将一个字符串中的小写字母转换为大写字母。不是字母的字符不需要做改变。
     *
     * @param str:A string
     * @return : A string
     */
    public String lowercaseToUppercase2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if (chars >= 'a' && chars <= 'z') {
                sb.append((char) (chars - 32));
            } else {
                sb.append(chars);
            }
        }
        return sb.toString();

/*     char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i]>='a' && chs[i]<='z'){
                chs[i]-=32;
            }
        }
        return new String(chs);
*/
    }

    /**
     * 给一个浮点数数组，求数组中的最大值。
     *
     * @param A:An integer
     * @return:a float number
     */
    public float maxOfArray(float[] A) {
        float maxNumber = A[0];//假设第一个数最大
        for (int i = 1; i < A.length; i++) {
            if (maxNumber <= A[i]) {
                maxNumber = A[i];
            }
        }
        return maxNumber;
    }

    /**
     * 给一个字符串, 转换为整数. 你可以假设这个字符串是一个有效的整数的字符串形式， 且范围在32位整数之间 (-231 ~ 231 - 1)。
     *
     * @param str: A string
     * @return: An integer
     */
    public int stringToInteger(String str) {
        boolean neg = false;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '-') {
                neg = true;
                continue;
            }
            result = result * 10 + c - 48;
        }
        if (neg) {
            result = -result;
        }
        return result;

        //return Integer.valueOf(str);
    }

    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;
        //return Math.max(Math.max(num1,num2),num3);
    }

    /**
     * 查找斐波纳契数列中第 N 个数。
     * 所谓的斐波纳契数列是指：
     * 前2个数是 0 和 1 。
     * 第 i 个数是第 i-1 个数和第i-2 个数的和。
     * 斐波纳契数列的前10个数字是：
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
     *
     * @param n
     * @return
     */
    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    /**
     * 递归实现斐波纳契数列
     *
     * @param n
     * @return
     */
    public int fibonacci1(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    /**
     * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
     *
     * @param A: an integer array
     */
    public void sortIntegers(int[] A) {
        boolean flag;
        for (int i = 0; i < A.length; i++) {//控制循环次数，每次为一趟
            flag = false;
            for (int j = 0; j < A.length - i - 1; j++) {//循环一次为一次相邻元素之间的比较
                if (A[j + 1] < A[j]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    /**
     * 给出两个整数 a , b ,以及一个操作符 opeator
     *
     * @param a
     * @param operator
     * @param b
     * @return
     */
    public int calculate(int a, char operator, int b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    /**
     * 在二叉树中寻找值最大的节点并返回
     *
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        if (root == null)
            return root;

        TreeNode left = maxNode(root.left);
        TreeNode right = maxNode(root.right);
        return max(root, max(left, right));

        /*TreeNode result = root;
        if (left!=null && result.val<left.val){
            result=left;
        }
        if (right !=null && result.val<right.val){
            result = right;
        }
        return result;*/
    }

    /**
     * @param a
     * @param b
     * @return
     */
    public TreeNode max(TreeNode a, TreeNode b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.val > b.val) {
            return a;
        }
        return b;
    }

    /**
     * 给定一个字符串数组lines, 每一个元素代表一个IP地址，找到出现频率最高的IP。
     *
     * @param ipLines: ip  address
     * @return: return highestFrequency ip address
     */
    public String highestFrequency(String[] ipLines) {
        String ans = ipLines[0];
        if (ipLines.length == 0 || ipLines == null) {
            return ans;
        }
        //使用hashmap记录每个IP出现的次数
        Map<String, Integer> map = new HashMap<>();
        for (String ipLine : ipLines)
            if (map.containsKey(ipLine)) {
                map.put(ipLine, map.get(ipLine) + 1);
            } else {
                map.put(ipLine, 1);
            }

        int max = 0;
        //遍历hashmap，找到频率最高的IP
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }

    /**
     * 给定一个字符串（以字符数组的形式给出）和一个偏移量，根据偏移量原地旋转字符串(从左向右旋转)
     * 输入:  str="abcdefg", offset = 3
     * 输出:  str = "efgabcd"
     * 样例解释:  注意是原地旋转，即str旋转后为"efgabcd"
     *
     * @param str    : An array of char
     * @param offset : An integer
     */
    public void rotateString(char[] str, int offset) {
        if (offset == 0 || str.length == 0)
            return;
        int target = offset % str.length;
        for (int i = 0; i < target; i++) {
            char temp = str[str.length - 1];//将最后一个字符保存，保证使用O(1)的额外空间
            for (int j = str.length - 1; j > 0; j--) {
                str[j] = str[j - 1];
            }
            str[0] = temp;
        }
    }

    /**
     * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
     * 如果这个数被3整除，打印fizz.
     * 如果这个数被5整除，打印buzz.
     * 如果这个数能同时被3和5整除，打印fizz buzz.
     * 如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。
     * 要求：使用一个if语句实现
     *
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int rs = 1;
        for (int i = 0; i < n; i++) {
            list.add(rs % 15 == 0 ? "fizz buzz" : rs % 3 == 0 ? "fizz" : rs % 5 == 0 ? "buzz" : String.valueOf(rs));
            rs++;
        }
        return list;
    }

    /**
     * 对于一个给定的 source 字符串和一个 target 字符串，
     * 你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。
     * 如果不存在，则返回 -1。
     *
     * @param source
     * @param target
     * @return: return the index
     */
    public int strStr(String source, String target) {

        if (source == null || target == null) {
            return -1;
        }
        int i, j;
        for (i = 0; i < source.length() - target.length() + 1; i++) {
            for (j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (j == target.length()) {
                return i;
            }
        }
        return -1;
        //return source.indexOf(target);
    }

    /**
     * 给定一个排序的整数数组（升序）和一个要查找的整数target，
     * 用O(logn)的时间查找到target第一次出现的下标（从0开始），
     * 如果target不存在于数组中，返回-1。
     * middle = low + ((high - low) >>1);//中间数索引位置
     *
     * @param nums:   The integer array
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;//扫描范围
        int middle = low + ((high - low) >> 1);//中间数索引位置
        while (low < high) {
            if (nums[middle] >= target) {
                high = middle;
            } else {
                low = middle + 1;
            }
            middle = low + ((high - low) >> 1);//中间数索引位置,更新只能写在这***
        }
        if (target == nums[middle]) {
            return middle;
        } else {
            return -1;
        }
    }

    /**
     * 给定一个列表，该列表中的每个元素要么是个列表，
     * 要么是整数。将其变成一个只包含整数的简单列表。
     *
     * @param nestedList:a list of NestedInteger
     * @return:a list of integer
     */
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (NestedInteger nes : nestedList) {
            if (nes.isInteger()) {
                result.add(nes.getInteger());
            } else {
                result.addAll(flatten(nes.getList()));
            }
        }
        return result;
    }

    /**
     * @param nestedList:a list of NestedInteger
     * @return:a list of integer
     */
    public List<Integer> flatten2(List<NestedInteger> nestedList) {
        List<Integer> result = new LinkedList<>();
        Stack<NestedInteger> stack = new Stack<>();
        //初始全部入栈
        nestedList.forEach(stack::push);
        while (!stack.isEmpty()) {
            NestedInteger current = stack.pop();
            if (current == null) {
                continue;
            }
            //当前为整数则添加到结果集中
            if (current.isInteger()) {
                ((LinkedList<Integer>) result).addFirst(current.getInteger());
            } else {
                //否则遍历列表将元素全部入栈
                current.getList().forEach(stack::push);
            }
        }
        return result;
    }

    /**
     * 给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。
     *
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    /**
     * 给定一个整数数组，找到一个具有最小和的连续子数组。返回其最小和。
     *
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer n : nums) {
            sum += n;
            min = Math.min(min, sum);
            sum = Math.min(sum, 0);
        }
        return min;
    }

    /**
     * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
     *
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        //
        int pivot = nums.get(0);
        int num = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == pivot) {
                num++;
            } else {
                num--;
            }
            if (num < 1) {
                pivot = nums.get(i);
            }
        }
        return pivot;
    }

    public int majorityNumber1(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : nums) {
            if (map.containsKey(integer)) {
                int value = map.get(integer);
                map.put(integer, ++value);
            } else {
                map.put(integer, 1);
            }
            int size = nums.size() / 2;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                int key = entry.getKey();
                if (value > size) {
                    return key;
                }
            }
        }
        return 0;
    }

    /**
     * 给定一个字符串，逐个翻转字符串中的每个单词。
     *
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return s;
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                if (sb.length() == 0) {
                    sb.append(words[i]);
                } else {
                    sb.append(" ").append(words[i]);
                }
            }
        }
        return sb.toString();
    }

    /**
     * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
     * 你需要实现的函数twoSum需要返回这两个数的下标,
     * 并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
     *
     * @param numbers: An array of Integer
     * @param target:  target = numbers[index1] + numbers[index2]
     * @return[index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
    public int sum(int a,int b){
        return a +b;
    }
}

