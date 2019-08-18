package pufaDemo;

import java.util.Scanner;

/**
 * 最长的回文串
 * 我们知道回文串一定是对称的，所以我们可以每次循环选择一个中心，
 * 进行左右扩展，判断左右字符是否相等即可。
 * 由于存在奇数的字符串和偶数的字符串，所以我们需要从一个字符开始扩展，
 * 或者从两个字符之间开始扩展，所以总共有 n+n-1 个中心。
 * Created by T on2019/8/8 14:04
 */
public class longestPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.nextLine();
            String result = longestPalindromeImpl(str);
            System.out.println(result);
        }
    }

    public static String longestPalindromeImpl(String s) {
        if (s == null || s.length() == 0)
            return null;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
