package pufaDemo;

/**
 * Created by T on2019/8/17 22:35
 */
public class pufa817 {

    public boolean isAllNumber(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public int[][] Matrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }
}
