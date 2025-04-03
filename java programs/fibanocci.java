import java.util.*;

public class fibanocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=0;
        int b=1;
        int c;
        int n=sc.nextInt();
        System.out.println(a);

        System.out.println(b);

        for(int i=2;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
          
    }
   
    
}
