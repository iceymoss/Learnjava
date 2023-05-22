package polymor.test;

import polymor.animal.Cat;
import polymor.animal.Dog;
import polymor.animal.Master;

public class MasterTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Master m = new Master();
        m.feed(cat);
        m.feed(dog);

        System.out.println("=======");
        m.feed(cat);
        m.feed(dog);

        System.out.println("=======");
        m.raise(false);
        m.raise(true);
    }
}
