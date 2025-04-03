import java.util.*;
public class parking {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter char array");
        char[] arr=sc.next().toCharArray();
        System.out.println(parkingSlots(arr));
    }
    static int parkingSlots(char[] arr){
        int curr=0;
        int maxcou=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='S'){
                curr++;
            }
            else{
                maxcou=Math.max(maxcou,curr);
                curr=0;
            }
        }
        maxcou=Math.max(maxcou,curr);
        return maxcou;



    }
}
