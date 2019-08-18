package wnagyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by T on2019/8/3 16:17
 */
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            int n =input.nextInt();
            ArrayList<String> list=new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                list.add(String.valueOf(i+1));
                Collections.sort(list);
            }
            Iterator<String> iterator =list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next()+" ");
            }
        }
    }
}
