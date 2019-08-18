package pufaDemo;

/**
 * Created by T on2019/8/18 10:05
 */
public class array {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                System.out.println(array[i].length);
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
