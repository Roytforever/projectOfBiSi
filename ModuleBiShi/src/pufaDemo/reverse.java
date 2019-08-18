package pufaDemo;

/**
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * Created by T on2019/8/8 12:01
 */
public class reverse {
    public static void main(String[] args) {
        char[] ch = {'h', 'i', 'j', 'k', 'l', 'm'};
        reverseString(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }

    public static void reverseString(char[] ch) {
        int start = 0, end = ch.length - 1;
        while (start <= end) {
            char temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;
            start++;
            end--;
        }
    }
}
