import java.util.*;
public class mapcollection {
    public static void main(String[] args) {
        Map<Integer,String>mp=new TreeMap<>();
        mp.put(101,"raju");
        mp.put(102,"rahul");
         mp.put(100,"Ajay");
           mp.put(101,"ravi");
    System.out.println(mp);
        mp.remove(102);
        System.out.println(mp.get(100));
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
    }
    
}
