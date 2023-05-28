package thread;

public class SyncDemoOne {
    class Pinter {
        //Java线程同步机制有三种方法
        Object lock = new Object();
            public void print () {
                //方法一：synchronized (lock){}实现线程同步
                //上锁,当前线程执行结束后，会释放锁，然后其他线程竞争锁
                synchronized (lock) {
                    try {
                        Thread.sleep(500);
                        System.out.print("魑");
                        Thread.sleep(500);
                        System.out.print("魅");
                        Thread.sleep(500);
                        System.out.print("魍");
                        Thread.sleep(500);
                        System.out.print("魉");
                        System.out.println();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
        }

        public synchronized void print2 () {
            //方法二：函数实现synchronized实现线程同步，我们不需要自定义锁，相当于是将当前对象this看成锁
            //上锁,当前线程执行结束后，会释放锁，然后其他线程竞争锁
            try {
                Thread.sleep(500);
                System.out.print("魑");
                Thread.sleep(500);
                System.out.print("魅");
                Thread.sleep(500);
                System.out.print("魍");
                Thread.sleep(500);
                System.out.print("魉");
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static synchronized  void print3 () {
            //方法二：直接使用static静态方法，当前方法唯一，需要调用必须获得调用权利
            //上锁,当前线程执行结束后，会释放锁，然后其他线程竞争锁
            try {
                Thread.sleep(500);
                System.out.print("魑");
                Thread.sleep(500);
                System.out.print("魅");
                Thread.sleep(500);
                System.out.print("魍");
                Thread.sleep(500);
                System.out.print("魉");
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class PrintTask implements Runnable {
        public Pinter p;
        public void run() {
            p.print3();
        }
    }

    public void start() {
        Pinter p = new Pinter();
        for(int i = 0; i < 10; i++) {
            PrintTask pk = new PrintTask();
            pk.p = p;
            Thread th = new Thread(pk);
            th.start();
        }
    }

    public static void main(String[] args) {
        SyncDemoOne sy = new SyncDemoOne();
        sy.start();
    }
}
