package iceymoss.animal;

public class AnimalTest {
    public static void main(String[] args) {
        //声明对象，在栈中
//        Animal cat;
//
//        //实例化对象，在堆中，将对象的地址复制给栈中
//        cat = new Animal();

        //调用无参构造函数
        Animal cat = new Animal();



        //调用有参构造函数
        Animal dog = new Animal("小黄", 2, 1.34, "阿拉斯加", "犬类");
        cat.month = 3;
        cat.name = "汤姆";
        cat.species = "阿拉斯加";
        cat.weight = 1.54;
        cat.eat();
        cat.run();
        System.out.printf("cat:",cat);

        dog.run();
        dog.run();
    }
}
