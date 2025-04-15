package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingThreadpool {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executors = Executors.newCachedThreadPool();

//        for(int i=0; i<3; i++) {
//            int taskId = i;
//            executor.submit(() -> {
//                System.out.println("Task -"+taskId + " is running by : "+Thread.currentThread().getName());
//                System.out.println("Is this deamon thread ? : "+Thread.currentThread().isDaemon());
//            });
//        }
//        executor.shutdown();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executors.submit(() -> System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName())
            );
        }
        executors.shutdown();
    }
}
