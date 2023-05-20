package iceymoss.test;

import iceymoss.animal2.*;
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("小黄");
        dog.special();
        dog.run();
        dog.eat();
        dog.sleep();
//        dog.eat(12);
//        dog.eat("哈哈哈");

        System.out.println("================");

        Cat cat = new Cat();
        cat.setName("花花");
        cat.catchMice();
        cat.run();

    }
}
