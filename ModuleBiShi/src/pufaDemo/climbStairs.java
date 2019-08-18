package pufaDemo;

import java.util.Scanner;

/**
 * Created by T on2019/8/13 11:03
 */
public class climbStairs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            int stairsNum = climbStairsNum(n);
            System.out.println(stairsNum);
        }
    }

    public static int climbStairsNum(int num) {
        if (num<=2)
            return num;
        if (num>2){
            int[] array=new int[num+1];
            array[0]=0;
            array[1]=1;
            array[2]=2;
            for (int i = 3; i <=num; i++) {
                array[i]=array[i-1]+array[i-2];
            }
            return array[num];
        }
        return 0;
    }
}
