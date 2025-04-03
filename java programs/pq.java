import java.util.*;
public class pq {
    public static void main(String[] args) {
        Deque<Integer> q=new LinkedList<>();
        //PriorityQueue<Integer> q=new PriorityQueue<>();
        q.offer(10);
        q.offer(23);
        q.offer(2);
        q.offer(30);
        q.offer(1);
        q.pollLast();
        System.out.println(q);
    }
    


}
