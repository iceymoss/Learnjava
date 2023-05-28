package thread;

import java.util.Random;

//java多线程
public class ThreadDemoOne {

    //定义一个内部类，通过继承Thread类实现多线程
    class Runner extends Thread {
        public void run() {
            Integer speed = new Random().nextInt(10);
            for(int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("第"+i+"秒"+this.getName()+"已跑到"+(i*speed)+"米("+speed+"/秒)");
            }
        }
    }

    public void start(String name) {
        //创建子线程
        Runner runA = new Runner();
        runA.setName(name);

        //开始运行子线程
        runA.start();
    }

    //主线程
    public static void main(String[] args) {
        ThreadDemoOne runner = new ThreadDemoOne();

        //主线程开启三个子线程
        runner.start("参赛者A");
        runner.start("参赛者B");
        runner.start("参赛者C");

    }
}
