public class arraysum {
    static boolean sumarray(int a[],int target){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==target){
                    return true;


                }

            }
        }
        return false;

    }
    public static void main(String[] args) {
        int a[]={1,2,4,3,-1,4,-3,8};
        int target=5;
        if(sumarray(a,target)){
            System.out.println("by adding two numbers target is find");
        }
        else{
            System.out.println("target not found");
        }
    }
    
}
