package iceymoss.car;

public class Car {
    //封装：
    // 使用public和private，
    // public：对外访问，允许在任意位置被访问；
    // private：只能在本类中被访问，不对外访问
    // protected：允许在当前类，同包类、跨包子类访问
    // 没有任何tags的含义：在本类或者同包中被访问

    private String name;
    private double price;
    private String country;

    private int date;
    private String type;


    //static表示静态的，表示在类中无论实例化多少对象，
    //他们对应的static属性都指向同一块内存，即不同对象的static属性系统
    //使用方法：1、类.属性； 2、对象.属性
    private static int total;


    //这种类中的代码块中对象实例化时被执行
    {
        System.out.println("我是构造代码块1");
    }

    {
        System.out.println("我是构造代码块2");
    }

    //静态代码块，静态代码块先执行，无论实例化多少对象都只会调用一次
    static {
        System.out.println("我是静态代码块1");
    }

    static {
        System.out.println("我是静态代码块2");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        if(price > 0) {
            this.price = price;
        }
    }
    public int getDate(){
        return this.date;
    }

    public void setDate(int date) {
        if(date > 0) {
            this.date = date;
        }
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    //和成员变量差不多
    public static void run() {
        System.out.println("车子会跑");

    }
}
