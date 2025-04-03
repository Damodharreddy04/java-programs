public class factorial {
    
    static int fct(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fct(n-1);

    }
    public static void main(String[] args) {
        int fact=fct(5);
        System.out.println(fact);
    }
}
