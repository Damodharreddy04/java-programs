class SharedResource{
     void print(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){}
        }
    }
}
public class syn {
    public static void main(String[] args)throws InterruptedException {
        SharedResource resource=new  SharedResource();
        Thread t1=new Thread(resource::print,"Thread 1");
        Thread t2=new Thread(resource::print,"Thread 2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    
}
