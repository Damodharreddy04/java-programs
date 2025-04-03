import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println("Enter the key value:");
        int key=sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("present");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("key value not present");

        }
        

        
    }
    
}
