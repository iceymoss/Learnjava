package polymor.animal;

public class Animal {
    //属性：名称、年龄
    private String name;
    private int month;

    public Animal(){

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

    public void eat() {
        System.out.println("动物都要吃东西");
    }

}
