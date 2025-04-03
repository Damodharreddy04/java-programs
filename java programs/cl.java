import java.util.concurrent.*;
public class cl {
    public static void main(String[] args)throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(3);
        Runnable worker=()->{
            System.out.println(Thread.currentThread().getName()+"worker started");
            try{
                Thread.sleep(2000);
                latch.countDown();
            }
            catch(InterruptedException e){

            }
        };
        for(int i=0;i<3;i++){
            new Thread(worker).start();
        }
        latch.wait();
        System.out.println("All threads are completed");
    }
    
}
