package lintCode.numberZero;

/**
 * 设计一个算法，计算出n阶乘中尾部零的个数
 */
public class numberZero {
   /*
   public static void main(String[] args) {

        int count =0;
        long pwr = 25;
        System.out.println("输入一个N：");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for (long i = 5; i <= n; i+=5) {
            if (i % 5 == 0)
                count++;
            pwr = 25;
            while (i % pwr ==0){
                count++;
                pwr *=5;
            }
        }
        System.out.println("n阶乘中尾部零的个数是：" + count);
    }*/

   public  long trailingZero(long n){
       //long startTime = System.currentTimeMillis();
       //System.out.println(startTime);
       long count=0;
       long temp =n/5;
       while (temp!=0){
           count+=temp;
           temp/=5;
       }
       //long endTime = System.currentTimeMillis();
       //System.out.println(endTime);
       return  count ;
   }
  /*  public static void main(String[] args) {
        System.out.println("请输入一个数N:");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        trailingZero(n);
    }*/
}
