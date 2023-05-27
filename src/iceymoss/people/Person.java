package iceymoss.people;

public class Person {
    public int age;

    public Heart GetHeart() {
        return new Heart();
    }

    public void eat() {
        System.out.println("人会吃东西");

    }

    //成员内部类:
    //内部类在外部使用时，无法直接实例化，需要借助外部类信息完成实例化
    //内部类的修饰符可以任意，但是外部访问范围会受到影响
    //内部类可以直接访问外部类成员，如果出现同名属性，则有限访问内部类定义的
    //可以使用外部类.this.成员的方式，访问外部类中同名的信息
    //在外部类中要使用内部类需要实例化内部类，无法直接使用
    //内部类编译之后.class文件命命：外部类$内部类.class
    public class Heart {
        int age  = 13;
        public String beat() {
            eat();
            return age+"心脏在跳动";
        }
    }

    //静态内部类：
    //静态内部类只能访问外部静态方法，如果需要调用非静态方法，可以通过实例化对象
    //静态内部类实例化时，不依赖外部类对象
    //当内部类和外部类属性同名时，默认直接调用内部类成员

    static class HeartStaict {
        int age  = 13;

        public void say() {
            System.out.println("hello");
        }

        public String beat() {
            new Person().eat();
            return age+"心脏在跳动";
        }
    }

    //方法内部类
//    public Object  GetHeart(){
//        class Heart1 {
//            int age  = 13;
//            public String beat() {
//                eat();
//                return age+"心脏在跳动";
//            }
//        }
//        return new Heart1();
//    }
}

