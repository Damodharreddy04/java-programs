public class threepointer {
public static void main(String[] args) {
int a[]={0,1,2,0,2,1,0,2,1};
sortarr(a);
for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
}
}
static int sortarr(int a[]){
    int l=0;
    int n=a.length;
    int h=n-1;
    int m=0;
    while(m<h){
        switch(m){
             case 0: swap(int m,int l);
                     m++;
                     l++;
                     break;
            case 1: m++;
                     break;
            case 2:swap(int m,int h);
                    h--;
                    break;

        }
    }
    

}
static int swap(int a[],int i,int j){
    int temp=a[j];
    a[j]=a[i];
    a[i]=temp;
}
    
}
