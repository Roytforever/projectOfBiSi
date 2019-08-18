package pufaDemo;

import java.util.Scanner;

/**
 * 编程实现以下分段函数:
 * 当x<0时，y=x+1
 * 当0<=x<1时，y=1
 * 　　当x>=1 时，y=x*x*x
 * <p>
 * 程序的运行结果如下所示：
 * 输入：
 * 1.5
 * 输出：
 * <p>
 * 3.375
 * Created by T on2019/8/6 18:02
 */
public class hanShu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            double x = input.nextDouble();
            double y = 0.0;
            if (x < 0) {
                y = x + 1.0;
            } else if (x >= 0 && x < 1) {
                y = 1.0;
            } else if (x >= 1) {
                y = x * x * x;
            }
            System.out.println(y);
        }
        input.close();
    }
}
