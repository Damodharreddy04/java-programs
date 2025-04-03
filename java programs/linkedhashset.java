import java.util.*;
public class linkedhashset {
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        s.add(10);
        s.add(30);
        s.add(50);
        s.add(20);
        s.add(40);
        System.out.println(s);
        s.remove(20);
        System.out.println(s);
    }
    
}
