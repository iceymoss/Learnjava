package singleton;
//懒汉式:类初始化对象时并不直接初始化，直到第一次调用get方法为止。
//实际上就是时间换空间的思想
public class SingletonTow {
    //1、创建私有构造方法
    private SingletonTow(){}

    //2、创建静态实例对象
    private static SingletonTow instance=null;

    //3、创建开放静态方法提供实例对象
    public static SingletonTow getInstance() {
        if (instance==null) {
            instance = new SingletonTow();
        }
        return instance;
    }
}
