public class thrd {
    public static void main(String[] args)throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println("Thread 1 is running");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        });
        Thread t2=new Thread(()->{System.out.println("Thread 2 is running");});
        t1.start();
        t1.join();
        t2.start();
    
    }

}
