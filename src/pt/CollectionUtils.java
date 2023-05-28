package pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//自定义泛型,我们在定义类的使用使用的是<E>，当然我们也可以使用<F>什么的，实例化的时候可以传入我们需要的数据类型
public class CollectionUtils<E> {

    public List<E> arr = new ArrayList<>();

    public void add(E item) {
        arr.add(item);
    }

    public E randomItem() {
        int rd = new Random().nextInt(arr.size());
        return arr.get(rd);
    }

    public static void main(String[] args) {
        CollectionUtils<String> arr = new CollectionUtils<>();
        arr.add("iceymoss");
        arr.add("java");
        System.out.println(arr.randomItem());
        System.out.println(arr.randomItem());

    }
}
