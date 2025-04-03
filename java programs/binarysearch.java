public class binarysearch {
    int BinarySearch(int a[],int l, int r,int key){
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==key){
                return m;
            }
            else if(a[m]>key){
                r=m-1;
            }
            else{
                l=m+1;
            }

        }
        return -1;


    }
    public static void main(String[] args) {
     int a[]={1,2,4,5,6,8,9,23,45,67};
        int n=a.length;
        int key=9;
        binarysearch bs=new binarysearch();
       int result= bs.BinarySearch(a, 0, n-1, key);
       System.out.println(result);
    }
    
}
