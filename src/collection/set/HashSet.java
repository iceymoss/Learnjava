package collection.set;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        //集合无序且不重复
        Set<String> num = new java.util.HashSet<>();
        num.add("x001");
        num.add("x002");
        num.add("x003");
        num.add("x003");
        System.out.println(num);

        System.out.println(num.contains("x001"));
        System.out.println(num.size());

    }
}
