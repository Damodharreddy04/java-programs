public class MaximumElement {
    public static void main(String[] args) {
        int [] arr={4,7,3,8,2,15,6,9,12};
        int left=0;
        int right=left+1;
        while(right<arr.length)
        {
            if(arr[left]<arr[right])
            {
                left=right;
            }
            right++;
        }
        System.out.println(arr[left]);
    }
}