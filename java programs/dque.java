import java.util.*;
public class dque {
    public static void main(String[] args) {
        ArrayDeque<Integer>dq=new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.addFirst(10);
        dq.addLast(40);
        dq.offerFirst(20);
        dq.offerLast(50);
        dq.pollLast();
        System.out.println(dq);

    }
    
}
