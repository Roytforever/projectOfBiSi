package pufaDemo;

/**
 * 判断从1990到2010年中的润年？并打印
 * Created by T on2019/8/6 11:33
 */
public class isLeapYear {
    public static void main(String[] args) {
        for (int i = 1990; i <= 2010; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
