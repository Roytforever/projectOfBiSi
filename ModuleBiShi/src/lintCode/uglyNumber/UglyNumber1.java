package lintCode.uglyNumber;

import java.util.PriorityQueue;

public class UglyNumber1 {
    public int nthUglyNumber(int n){
        if (n==1)
            return 1;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        //System.out.println(queue.poll());
        for (long i = 1; i < n; i++) {
            long temp=queue.poll(); //出队，取出最小元素
            while (!queue.isEmpty() && queue.peek()==temp )
                temp=queue.poll();
            queue.add(temp*2);
            queue.add(temp*3);
            queue.add(temp*5);
        }
        return queue.poll().intValue();
    }
}
