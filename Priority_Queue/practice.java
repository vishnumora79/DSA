package Priority_Queue;
import java.util.PriorityQueue;
// In Java, by default priority queue is a min priority queue

//MIN - PRIORITY QUEUE
//public class practice {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> integers = new PriorityQueue<>();
//
//        integers.add(5);
//        integers.add(2);
//        integers.add(7);
//
//        int x = integers.peek();
//        int y = integers.poll();
//        integers.remove(5);
//        System.out.println(x);
//        System.out.println(integers.size());
//        System.out.println(y);
//    }
//}

// MAX - PRIORITY QUEUE

import java.util.PriorityQueue;
import java.util.Comparator;
class CustomComparator implements Comparator<Integer> {
    public int compare(Integer x, Integer y) {
        if(x < y)
              return +1;
        if(x.equals(y))
             return 0;
        return -1;
    }
}
public class practice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(new CustomComparator());
        pQueue.add(3);
        pQueue.add(2);
        pQueue.add(6);
        for(int it : pQueue)
            System.out.print(it + " ");
        System.out.println();
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
    }
}

