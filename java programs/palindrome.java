public class palindrome {
    public static void main(String[] args) {
        String rev="";
        String s="madam";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
