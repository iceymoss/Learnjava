package polymor.animal;

public class Dog extends Animal{
    //属性：性别
    private String sex;

    //构造函数

    public Dog() {}


    public Dog(String name, int month, String sex) {
        this.setName(name);
        this.setMonth(month);
        this.sex = sex;
    }

    //方法：睡觉
    public void sleep(){
        System.out.println(this.getName()+"要睡觉");
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"是小狗喜欢啃骨头");
    }
}
