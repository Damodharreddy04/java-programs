import java.util.*;
public class lns {
    public static void main(String[] args) {
        LinkedList<Integer>lis=new LinkedList<>();
        lis.add(10);
        lis.addFirst(20);
        lis.addLast(30);
        lis.contains(20);
        for(int i:lis){
            System.out.print(i+" ");
        }
        int a=lis.getLast();
        lis.getFirst();
        System.out.println(a);
    }
}
