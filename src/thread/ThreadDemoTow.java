package thread;

import java.util.Random;

public class ThreadDemoTow {
    //实现多线程方法二：实现Runnable接口
    class Runner implements Runnable {
        public void run() {
            Integer speed = new Random().nextInt(10);
            for(int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("第"+i+"秒"+Thread.currentThread().getName()+"已跑到"+(i*speed)+"米("+speed+"/秒)");
            }
        }
    }

    public void start(String name) {
        Runner runner = new Runner();
        Thread runA = new Thread(runner);
        runA.setName(name);
        runA.start();
    }
    public static void main(String[] args) {
        ThreadDemoTow run = new ThreadDemoTow();
        run.start("参赛者A");
        run.start("参赛者B");

    }
}
