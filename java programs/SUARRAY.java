public class SUARRAY {
public static void main(String[] args) {
    int n=4;
    int[] arr={5,1,3,4};
    int a=3;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]+arr[i]>=2*a){
                System.out.println("("+arr[i]+","+arr[j]+")"+" ");
            }
        }
    }
}
}
