package pufaDemo;


/**
 * Created by T on2019/8/13 11:30
 */
public class plusOne {
    public static void main(String[] args) {
        int[] array = {9, 9, 9, 9};
        int[] ints = plusOneImpl(array);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    public static int[] plusOneImpl(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
