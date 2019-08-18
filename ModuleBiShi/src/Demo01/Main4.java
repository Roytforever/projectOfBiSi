package Demo01;
/*
输入包括多组测试数据。
每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
学生ID编号从1编到N。
第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候,
表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。
 */
import java.io.*;
import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        String str;
        Integer M, N;
        while (cin.hasNext()) {
            N = cin.nextInt();
            M = cin.nextInt();
            int grade[] = new int[N];
            for (int i = 0; i < N; i++) {
                grade[i] = cin.nextInt();
            }
            str = cin.nextLine();
            int max[] = new int[M];
            int count = 0;
            for (int i = 0; i < M; i++) {
                str = cin.nextLine();
                String[] strArray = str.split(" ");
                if (strArray[0].equals("Q")) {
                    int a = Integer.parseInt(strArray[1]);
                    int b = Integer.parseInt(strArray[2]);
                    int start = Math.min(a, b) - 1;
                    int end = Math.max(a, b);
                    max[count++] = findMax(Arrays
                            .copyOfRange(grade, start, end));
                } else if (strArray[0].equals("U")) {
                    int index = Integer.parseInt(strArray[1]);
                    int value = Integer.parseInt(strArray[2]);
                    grade[index - 1] = value;
                }
            }
            for (int j = 0; j < count; j++) {
                System.out.println(max[j]);
            }
        }
    }

    private static int findMax(int[] a) {
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
