package polymor.animal;

public class Master {
    //喂宠物：喂猫和喂狗

    //方案一：
    public void feed(Cat cat) {
        cat.eat();
        cat.playBoll();
    }

    public void feed(Dog dog) {
        dog.eat();
        dog.sleep();
    }

    //方案二：
    public void feed(Animal obj) {
        if(obj instanceof Cat) {
            Cat cat = (Cat)obj;
            cat.eat();
            cat.playBoll();
        }else if(obj instanceof Dog) {
            Dog dog = (Dog)obj;
            dog.eat();
            dog.sleep();
        }
    }

    //有空余时间：养猫
    //空余时间少：养狗
    //方案1：
    public Cat hasManyTime() {
        System.out.println("有空余时间");
        return new Cat();
    }

    public Dog hasTittleTime() {
        System.out.println("没有空余时间");
        return new Dog();
    }

    public Animal raise(boolean time) {
        if(time) {
            System.out.println("有空余时间, 适合养狗");
            return hasManyTime();
        }else{
            System.out.println("没有空余时间， 适合养猫");
            return hasTittleTime();
        }
    }





}
