package singleton;

public class Test {
    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne tow = SingletonOne.getInstance();
        System.out.println(one==tow);
        System.out.println(tow);
        System.out.println("=========");
        SingletonTow one1  = SingletonTow.getInstance();
        SingletonTow tow1 = SingletonTow.getInstance();
        System.out.println(one1==tow1);
        System.out.println(tow1);

    }
}
