import java.util.*;
public class st {
    public static void main(String[] args) {
        Stack<Integer>lis=new Stack<>();
        lis.add(10);
        lis.add(20);
        lis.add(30);
        lis.add(40);
        lis.add(50);
        System.out.println(lis);
        lis.size();
        lis.remove(0);
        lis.elementAt(1);
        lis.indexOf(4);
        lis.contains(30);
        lis.pop();
        System.out.println(lis);
    }
    
}
