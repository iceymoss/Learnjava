package thread.pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //定长线程池
        ExecutorService executors = Executors.newFixedThreadPool(10);

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
