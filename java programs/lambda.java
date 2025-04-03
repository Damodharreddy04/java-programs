public class lambda {
    public static void main(String[] args) {
        
        arithmetic add=(a,b)->a+b;
        arithmetic sub=(a,b)->a-b;
        arithmetic mul=(a,b)->a*b;
        System.out.println(add.arth(5,4 ));
        System.out.println(sub.arth(8, 4));
        System.out.println(mul.arth(5, 6));
    }
    
}
interface arithmetic{
    int arth(int a, int b);
}
