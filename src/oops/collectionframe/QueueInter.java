package oops.collectionframe;

import java.util.*;

public class QueueInter{
    static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        //single ended queue
        //insert methods-enqueue
        queue.add(1);//exception if fail
        queue.offer(2);//flase
        queue.offer(3);
//        //front access
//        System.out.println(queue.peek());// null
//        System.out.println(queue.element());//exception
        queue.remove();
        queue.poll();

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(40);
        pq.offer(50);
        pq.offer(90);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());System.out.println(pq.poll());

        PriorityQueue<Integer> pq2=new PriorityQueue<>((a,b)->b-a);
        pq2.offer(10);
        pq2.offer(30);
        pq2.offer(20);
        pq2.offer(40);
        pq2.offer(50);
        pq2.offer(90);
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
    }
}
