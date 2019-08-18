package lintCode.sumOper;

/**
 * 给出两个整数 aa 和 bb , 求他们的和。
 */
public class sum {

    public int aplusb(int a, int b){
        if (b == 0)
            return a;
        int sum = a^b;
        int carry = (a&b) <<1;
        return aplusb(sum,carry);
    }
}
