import java.util.*;
public class chocolate {
    public static void main(String[] args) {
        int[] arr = {10, 4, 12, 3, 1};
        int n = arr.length;
        int m = 4;
        
        System.out.println(chocolatedistribution(arr, n, m));

    }
    static int chocolatedistribution(int arr[],int n,int m){
        if(m>n){
            return -1;
        }
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n-m;i++){
            int diff=arr[i+m-1]-arr[i];
            minDiff=Math.min(minDiff,diff);
        }
        return minDiff;

    }
}
