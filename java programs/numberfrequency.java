public class numberfrequency {
    static String numarray(int a[]){
    String res="";
       int n=a.length;
       for(int i=0;i<n;i++){
        int count=1;
        boolean seen=false;
        for(int j=0;j<i;j++){
            if(a[j]==a[i]){
                seen=true;
                break;
        }
       }
       if(seen) continue;
       for(int j=i+1;j<n;j++){
        if(a[j]==a[i]){
            count++;
        }
       }
       res+=a[i]+ "count:"+ count+" ";
    }
    return res;
}
    public static void main(String[] args){
        int a[]={1,2,2,3,3,3,3,4,4,4,4,4};
        System.out.println(numarray(a));
    }
    
}
