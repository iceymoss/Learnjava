package polymor.animal;

public class Cat extends Animal {
    //属性：体重
    private int weight;


    //构造方法
    public Cat() {}

    public Cat(String name, int month, int weight) {
        this.setName(name);
        this.setMonth(month);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //方法：跑动
    public void run(){
        System.out.println(this.getName()+"会跑动");
    }

    //重写父类eat()

    @Override
    public void eat() {
        System.out.println(this.getName()+"是小猫它喜欢吃鱼");
    }

    public void playBoll(){
        System.out.println(this.getName()+"玩球");
    }







}
