package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/17 21:38
 */
public class dayOfYear {
    public static void main(String[] args) {
        int allday = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年月日，格式如：1997/01/01:");
        while (input.hasNext()) {
            String dateStr = input.nextLine();
            String[] dateInt = dateStr.split("/");
            int year = Integer.parseInt(dateInt[0]);
            int month = Integer.parseInt(dateInt[1]);
            int day = Integer.parseInt(dateInt[2]);
            for (int i = 0; i < month - 1; i++) {
                allday += days[i];
            }
            allday += day;
            if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month > 2) {
                allday++;
            }
            System.out.println(month + "月" + day + "日是" + year + "年的第" + allday + "天");
        }
    }
}
