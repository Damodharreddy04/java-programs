import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int revnum=0;
        while(num>0){
            int rem=num%10;
            revnum=revnum*10+rem;
            num=num/10;
        }
        System.out.println(revnum);
    }
    
}
