package polymor.test;

import polymor.animal.Animal;
import polymor.animal.Cat;
import polymor.animal.Dog;

public class Test {
    public static void main(String[] args) {
        Animal one = new Animal();

        //向上转型：隐式转型，自动转型
        //父类引用指向子类实例，可以调用父类重写子类的方法以及父亲派生的方法，无法调用独有方法
        //小类转为大类
        //instanceof 判断两个对象类型是否相同：返回Boolean
        Animal tow = new Cat();
        Animal three = new Dog();
        one.eat();
        tow.eat();
        three.eat();

        System.out.println("=========");
        //向下转型：强制类型转换
        Cat temp = (Cat)tow;
        temp.run();
        temp.eat();
        temp.getMonth();

        if(tow instanceof Cat) {
            Cat temp1 = (Cat)tow;
            temp1.eat();
            temp1.run();
            System.out.println("tow转换为Cat类型");
        }

        if(tow instanceof Dog) {
            Dog temp2 = (Dog)tow;
            temp2.sleep();
            temp2.eat();
            System.out.println("tow转换为Dog类型");
        }

        if(tow instanceof Animal) {
            System.out.println("Animal");
        }

        if(tow instanceof Object) {
            System.out.println("Object");
        }






    }
}
