import java.util.concurrent.*;
import javax.security.auth.callback.Callback;
public class callbacks {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor=Executors.newSingleThreadExecutor();
        Callable<Integer>task=()->{
            Thread.sleep(200);
            return 10*10;
        };
        Future<Integer>future=executor.submit(task);
        System.out.println("Doing the task");
        Integer res=future.get();
        System.out.println("result"+res);
        System.out.println("Task");
        executor.shutdown();

    }
    
}
