import java.util.*;
public class Swap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("a=");
        int a=s.nextInt();
        System.out.print("b=");
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+",b="+b);

    }
}
