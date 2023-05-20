package iceymoss.animal;

public class Animal {
    //属性:昵称，年龄，体重，品种
    String name;
    int month;
    double weight;
    String species;
    String animalType;




    //构造函数，用来初始化对象的，如果我们没有定义构造函数，java会为我们自动定义构造函数
    public Animal(){
        System.out.println("我是构造方法");
    }

    //定义一个有参构造函数

    public Animal(String newname) {
        name = newname;
    }

//    public Animal(String newname, int newmonth, double newweight, String newspecies, String newtype) {
//        name = newname;
//        month = newmonth;
//        weight = newweight;
//        species = newspecies;
//        animalType = newtype;
//    }


    //使用this关键字：表示当前对象的属性和方法
    public Animal(String name, int month, double weight, String species, String type) {
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
        this.animalType = type;
    }

    //方法:会跑，会吃
    public void run() {
        System.out.println(this.name+"会跑");
    }

    public void eat() {
        System.out.println(this.name+"会吃");
    }
}
