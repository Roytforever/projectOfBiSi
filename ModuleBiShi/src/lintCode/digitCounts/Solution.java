package lintCode.digitCounts;

public class Solution {
    /**
     * 计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0~9 的一个值。
     * @param k
     * @param n
     * @return  An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n){
        int res =0;
        for (int i = 0; i <=n ; i++) {
            int temp=i;
            while (temp!=0){
                if (temp % 10 ==k)
                    res++;
                temp /= 10;
            }
        }
        return k == 0? res+1:res;
    }
}
