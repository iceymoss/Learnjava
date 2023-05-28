package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemoTow {
    public static void main(String[] args) {
        //可缓存线程池，根据情况调整，动态增加的，无限大，用空闲利用空闲，不够就创建线程
        ExecutorService executors = Executors.newCachedThreadPool();

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
