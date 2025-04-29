import java.util.*;
public class PowerOfTwo
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
        if(num>0 && (num&(num-1))==0)
        {
            System.out.println("The number'"+num+"' is a Power of Two");
        }
        else
        {
            System.out.println("The number'"+num+"' is not a Power of Two");
        }
    }
}
