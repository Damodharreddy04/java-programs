public class SuperiorElements {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        int max=arr[n-1];
        System.out.print(max+" ");
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }
}