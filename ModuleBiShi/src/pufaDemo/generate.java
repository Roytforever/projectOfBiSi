package pufaDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 杨辉三角
 * Created by T on2019/8/8 14:18
 */
public class generate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int numRows = input.nextInt();
            List<List<Integer>> lists = generateImpl(numRows);
            for (List<Integer> list : lists) {
                System.out.println(list);
            }
        }
    }

    public static List<List<Integer>> generateImpl(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            row.add(1);
            for (int i = 1; i < rowNum; i++) {
                row.add(prevRow.get(i - 1) + prevRow.get(i));
            }

            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
