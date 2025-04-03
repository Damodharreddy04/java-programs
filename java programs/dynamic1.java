import java.util.HashMap;

public class dynamic1 {
    /*static HashMap<Integer,Long> memo=new HashMap<>();

    public static void main(String[] args) {
        int n=6;
        long res=fib(n);
        System.out.println(res);
    }
    private static long fib(int n){
        if(n<=1) return 1;
        if(memo.containsKey(n))
        return memo.get(n);
        long result=fib(n-1)+fib(n-2);
        memo.put(n,result);
        return result;
        }*/
 

	static HashMap<Integer, Long> memo = new HashMap<Integer, Long>();
 
   	private static long fib(int n) {
   		
		// TODO Auto-generated method stub
		if(n<=1)return n;
		
		if(memo.containsKey(n))
			return memo.get(n);
		
		long result=fib(n-1)+fib(n-2);
		memo.put(n, result);
				
		return result;
	}
	 public static void main(String[] args) {
	       
	    	int n=6;
	    	n=n+1;
	    	long res=fib(n);
	    	System.out.println(res);
	    	
	    	
	    }
}
 
 

