package pufaDemo;

import javax.xml.transform.Result;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

/**
 * A,B两个字符串,求在第一个字符串出现,第二个字符串中未出现的,
 * 重复只取第一次出现,输出字符串。
 * Created by T on2019/8/8 16:54
 */
public class charOfNotFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String strA = input.nextLine();
            String strB = input.nextLine();
            char result = stringOfFind(strA, strB);
            System.out.println(result);
        }
    }

/*    private static char stringOfFind(String strA, String strB) {
        int i, j;
        char result=' ';
        for (i = 0; i < strA.length(); i++) {
            for (j = 0; j < strB.length(); j++) {
                if (strA.charAt(i) == strB.charAt(j)) break;

            }
            if (j >= strB.length()) {
                result = strA.charAt(i);
            }
        }
        return result;

    }*/

    public static char stringOfFind(String str1, String str2) {
        String str3 = "";
        for (int i = 0; i < str1.length(); i++) {
            int j = 0;
            while (j < str2.length()) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    break;
                }
                j++;
            }
            if (j == str2.length()) {
                str3 += str1.charAt(i);
            }
        }
        return str3.charAt(0);
    }
}
