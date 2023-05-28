package thread;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadDemoThree {

    class Runner implements Callable<Integer> {
        public String name;

        @Override
        public Integer call() throws Exception {
            Integer speed = new Random().nextInt(10);
            Integer res = 0;
            for(int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("第"+i+"秒"+Thread.currentThread().getName()+"已跑到"+(i*speed)+"米("+speed+"/秒)");
                res = i*speed;
            }
            return res;
        }
    }

    public void start() throws Exception, InterruptedException {
        //创建一个容量为3的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runner runA = new Runner();
        runA.name  = "参赛者A";
        Runner runB = new Runner();
        runB.name = "参赛者B";
        Runner runC = new Runner();
        runC.name = "参赛者C";

        //线程执行完毕后返回，返回我们定义的数据
        Future<Integer> r1 = executorService.submit(runA);
        Future<Integer> r2 = executorService.submit(runB);
        Future<Integer> r3 = executorService.submit(runC);

        ///线程执行完毕后关闭线程池
        executorService.shutdown();

        System.out.println(runA.name+"已跑到"+r1.get()+"米");
        System.out.println(runB.name+"已跑到"+r2.get()+"米");
        System.out.println(runC.name+"已跑到"+r3.get()+"米");
    }

    public static void main(String[] args) throws Exception, InterruptedException {
       new ThreadDemoThree().start();


    }
}
