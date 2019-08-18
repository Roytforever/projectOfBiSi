package pufaDemo;

/**
 * 猴子第一天吃了若干个桃子，当即吃了一半，还不解馋，又多吃了一个；
 * 第二天，吃剩下的桃子的一半，还不过瘾，又多吃了一个；
 * 以后每天都吃前一天剩下的一半多一个，到第10天想再吃时，
 * 只剩下一个桃子了。问第一天共吃了多少个桃子？
 * Created by T on2019/8/6 17:32
 */
public class monkey {
    public static void main(String[] args) {
        int day=9;
        int next=1;//di天桃子数量
        int pre=0;//前一天桃子数量
        while (day>0){
            pre=2*(next+1);
            next=pre;
            day--;
        }
        System.out.println(pre);
    }
}
