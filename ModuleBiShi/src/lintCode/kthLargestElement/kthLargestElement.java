package lintCode.kthLargestElement;

public class kthLargestElement {

    /**
     * 在数组中找到第 k 大的元素。
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public static int kthLargestElement(int k, int[] nums) {
        quickstart(0,nums.length-1,nums);
        return nums[nums.length-k];
    }

    /**
     *
     * @param l
     * @param r
     * @param nums
     */
    public static void quickstart(int l,int r,int[]nums){
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换
            int i = l, j = r, temp = nums[l];
            while (i < j)
            {
                while(i < j && nums[j] >= temp) // 从右向左找第一个小于temp的数
                    j--;
                if(i < j)
                    nums[i++] = nums[j];

                while(i < j && nums[i] < temp) // 从左向右找第一个大于等于temp的数
                    i++;
                if(i < j)
                    nums[j--] = nums[i];
            }
            nums[i] = temp;
            quickstart( l, i - 1,nums); // 递归调用排序基数前面一半
            quickstart( i + 1, r,nums);//递归调用排序基数后面一半
        }
    }
}


