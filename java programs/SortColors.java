public class SortColors {
    public static void main(String[] args) {
        int arr[]={2, 0, 2, 1, 1, 0, 2, 0, 1};

        int left=0,mid=0,right=arr.length-1;

        while(mid<right)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[left];
                arr[left]=temp;
                left++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--; 
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}