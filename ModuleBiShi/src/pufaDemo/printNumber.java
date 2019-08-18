package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/13 15:28
 */
public class printNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            String str=input.nextLine();
            for (int i = 1; i < str.length(); i+=2) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
