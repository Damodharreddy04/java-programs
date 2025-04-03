import java.util.*;
public class frequency {
    static String modifystring(String s){
        String res="";
        int n=s.length();
        for(int i=0;i<n;i++){
            int count=1;
            boolean seen=false;
            for (int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i)){
                    seen=true;
                    break;
                }
            }
                if(seen) continue;
                    for( int j=i+1;j<n;j++){
                        if(s.charAt(j)==s.charAt(i)){
                            count++;

                        }

                    }
                res+=s.charAt(i)+  Integer.toString(count) + " ";
        }
        return res;
    }
    public static void main(String[] args) {
        String s="damodhar";
           System.out.println(modifystring(s));
    }
    
}
