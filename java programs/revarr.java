public class revarr {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int rev[]=new int[n];
        for(int i=n-1;i>=0;i--){
            System.out.print((rev[i]=arr[i])+" ");
        }
    }
}
