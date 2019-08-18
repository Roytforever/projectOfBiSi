package wnagyi;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by T on2019/8/3 15:24
 */
public class main1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String n = input.nextLine();
        int m =Integer.parseInt(n);
        String score =input.nextLine();
        String[] scores=score.split(" ");
        int[] score_n=new int[m];
        for (int i = 0; i < m; i++) {
            score_n[i]=Integer.parseInt(scores[i]);
        }

        int q =input.nextInt();
        String[] result =score(m,score_n);
        while (input.hasNext()){
            System.out.println(result[input.nextInt()-1]);
        }
    }

    private static String[] score(int num, int[] scores) {
        int[] temp=new int[num];
        for (int i = 0; i < num; i++) {
            temp[i]=scores[i];
        }
        Arrays.sort(temp);
        String[] result_temp=new String[num];
        for (int i = 0; i < num; i++) {
            DecimalFormat df = new DecimalFormat("0.000000");
            result_temp[i]=df.format((i*100.000000)/num);
        }
        String[] result=new String[num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (scores[i]==temp[j]){
                    result[i]=result_temp[j];
                }
            }
        }
        return result;
    }
}
