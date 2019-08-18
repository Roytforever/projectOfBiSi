package pufaDemo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by T on2019/8/6 12:48
 */
public class facNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            int n =input.nextInt();
            System.out.println(factorial(n));
        }
    }

    public static BigInteger factorial(int n){
        if (n==0){
            return BigInteger.valueOf(1);
        }else {
            BigInteger[] array=new BigInteger[n+1];
            array[0]=BigInteger.valueOf(1);
            BigInteger num = new BigInteger("1");
            BigInteger flat = new BigInteger("1");
            for ( int i = 1; i <=n; i++) {
                flat=flat.multiply(num);
                num=num.add(new BigInteger("1"));
                array[i]=flat;
            }
            return array[n];
        }
    }
}
