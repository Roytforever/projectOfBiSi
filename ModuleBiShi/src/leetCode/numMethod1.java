package leetCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by T on2019/8/1 15:35
 */
public class numMethod1 {
    /*public static void main(String[] args) {
        easyCode ec = new easyCode();
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        int count = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = input.nextInt();
            count++;
            if (array[i] == 0) {
                break;
            }
        }
        for (int i = 0; i < count - 1; i++) {
            System.out.println(ec.numMethod(array[i]));
        }
    }*/
    public static void main(String[] args) {
        easyCode ec = new easyCode();
        Scanner input=new Scanner(System.in);
        List<Integer> lists = new ArrayList<>();
        while (input.hasNext()){
            int list = input.nextInt();
            if (list ==0){
                break;
            }else {
                lists.add(list);
            }
        }
        for (Integer result : lists) {
            System.out.println(ec.numMethod(result));
        }
    }
}
