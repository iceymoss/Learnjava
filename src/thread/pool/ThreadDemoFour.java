package thread.pool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ThreadDemoFour {
    public static void main(String[] args) {
        //调度线程池，类似定时任务
        ScheduledExecutorService executors = Executors.newScheduledThreadPool(5);
        executors.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date()+"延迟一秒执行，每三秒执行一次");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }
}
