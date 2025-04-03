import java.util.*;
public class linkedhashmapcol {
    public static void main(String[] args) {
        Map<Integer,String>mp=new LinkedHashMap<>();
        mp.put(101,"ravi");
        mp.put(105,"ajay");
        mp.put(102,"c");
        mp.put(104,"d");
        mp.putIfAbsent(102, "b");
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }
}
