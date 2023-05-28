package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemoThree {
    public static void main(String[] args) {
        //单线程池，只有一个线程，执行任务，所有的任务都需要使用者一个线程来执行
        ExecutorService executors = Executors.newSingleThreadExecutor();

        for(int i = 0; i < 1000; i++) {
            int index = i;
            //并非直接实例化接口，而是使用匿名类实例化
            executors.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"：运行了"+index+"次");
                }
            });
        }
        executors.shutdown();
    }
}
