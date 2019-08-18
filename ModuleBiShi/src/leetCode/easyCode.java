package leetCode;


/**
 * Created by T on2019/7/29 11:32
 */
public class easyCode {
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.
     * 则经过替换之后的字符串为We%20Are%20Happy。
     * "空间换时间"
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        if (str == null) {
            return s;
        }
        char[] ss = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == ' ') {
                sb.append("%20");
            } else
                sb.append(ss[i]);
        }
        return sb.toString();
    }

    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.
     * 则经过替换之后的字符串为We%20Are%20Happy。
     *
     * @param str
     * @return
     */
    public String replaceSpace1(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.deleteCharAt(i);
                str.insert(i, "%20");
            }
        }
        return str.toString();
    }

    /**
     * 找出正整数中偶数，并输出相加后的数，要用 long.
     *
     * @param num
     * @return
     */
    public long sumOfEven(long num) {

        long sum = 0L;
        while (num > 0) {
            if (((num % 10) % 2) == 0) {
                sum = sum + (num % 10);
            }
            num /= 10;
        }
        return sum;
    }

    /**
     * 输入 n 和 b , 找出 1 到 n 中被 b 整除的个数.
     *
     * @param n
     * @param b
     * @return
     */
    public int numCount(int n, int b) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % b == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 算法-有n步台阶，一次只能上1步或2步，共有多少种走法
     * 动态规划求解
     *
     * @param n:台阶数
     * @return:上台阶的选择方案
     */
    public long numMethod(int n) {
        if (n <= 2) {
            return n;
        }
        if (n > 2) {
            long array[] = new long[n + 1];
            array[0] = 0;
            array[1] = 1;
            array[2] = 2;
            for (int i = 3; i < n + 1; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            return array[n];
        }
        return 0;
    }


}
