package pufaDemo;


/**
 * Created by T on2019/8/13 14:34
 */
public class moveZero {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 0, 5, 6, 7, 0, 9};
        int[] number = moveZeroNumber(array);
        for (int i : number) {
            System.out.print(i + " ");
        }
    }

    public static int[] moveZeroNumber(int[] array) {
        int len = array.length;
        int[] array2 = new int[len];
        int count = 0, j = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] != 0) {
                array2[j++] = array[i];
            } else {
                count++;
            }
        }
        while (count > 0) {
            array2[j++] = 0;
            count--;
        }
        return array2;
    }
}
