package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/13 14:00
 */
public class addStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str1 = input.nextLine();
            String str2 = input.nextLine();
            String stringsImpl = addStringsImpl(str1, str2);
            System.out.println(stringsImpl);
        }
    }

    public static String addStringsImpl(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
}
