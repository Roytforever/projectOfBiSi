package wnagyi;

import java.util.Scanner;

/**
 * Created by T on2019/8/3 16:40
 */
public class main3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int m = input.nextInt();
        int[] array=new int[m];
        boolean flag=false;
        for (int i = 0; i < m; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (array[0]>array[m-1]+array[1]){
                flag=false;
            }else if (array[m-1]>array[0]+array[m-2]){
                flag=false;
            }else if (array[i]>array[i+1]+array[i-1]){
                flag=false;
            }else flag=true;
        }
        if (flag==false){
            System.out.println("NO");
        }else if (flag==true){
            System.out.println("YES");
        }
    }
}
