package singleton;

import java.util.PropertyResourceBundle;

//设计模式之单例模式：饿汉式：创建对象实例的时候就直接创建
//使用空间换时间，不管你要不要，先创建出来，后续需要直接使用即可
public class SingletonOne {
    //1、创建私有构造
    private SingletonOne(){}

    //2、创建该类型的私有实例
    private static SingletonOne instance= new SingletonOne();

    //3、创建公有静态方法返回实例对象
    public static SingletonOne getInstance() {
        return instance;
    }


}
