package iceymoss.animal2;

public class Dog extends Animal {
    private Double weight;


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //狗狗看家
    public void special() {
        System.out.println(this.getName()+"会看家");
    }

    //当子类重写父类的方法后，子类调用的就是子类的方法
    //对于方法重写：如果是基本数据类型，就需要满足父类和子类的返回值一直，如果是引用类型返回值可也是父类或者子类
    //访问修饰符：对于方法重写，子类访问范围需要大于等于父类的访问范围
    public void eat() {
        System.out.println(this.getName()+"最近没有食欲");
    }

    public void eat(int month) {
        System.out.println(month+"最近没有食欲");
    }

    //如果子类重写了父类的某一个方法，在调用时默认是调用子类重写的方法，但是通过使用super来指定对父类的调用
    public void sleep() {
        //通过使用super来指定对父类的调用
        super.eat();
    }
}
