package polymor.animal;


//abstract:表示抽象类，不允许被直接实例化
public abstract class Animal2 {
    //属性：名称、年龄
    private String name;
    private int month;

    public Animal2(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //abstract：抽象方法，没有和抽象类一样没有实际意义，不允许有函数体，子类需要重写父类的抽象方法，否则子类也是抽象类
    //static、final、private是一定不能和abstract一起使用的
    public abstract void eat();

}
