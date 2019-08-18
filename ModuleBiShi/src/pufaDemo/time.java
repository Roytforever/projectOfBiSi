package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/14 10:33
 */
public class time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str1 = input.nextLine();
            String str2 = input.nextLine();
            int time = timeImpl(str1, str2);
            System.out.println(time / 60 + "h," + time % 60 + "m.");
        }
    }

    public static int timeImpl(String time1, String time2) {
        int startTime = timeOfM(time1);
        int endTime = timeOfM(time2);
        if (startTime >= endTime) {
            return startTime - endTime;
        } else {
            return endTime - startTime;
        }

    }

    public static int timeOfM(String str1) {
        int time = 0;
        if (str1.length() == 3) {
            String sub = str1.substring(1);
            String sub2 = str1.substring(0, 1);
            time = Integer.parseInt(sub2) * 60 + Integer.parseInt(sub);
            ;
        } else if (str1.length() == 4) {
            String sub = str1.substring(2);
            String sub2 = str1.substring(0, 2);
            time = Integer.parseInt(sub2) * 60 + Integer.parseInt(sub);
        }
        return time;
    }
}
