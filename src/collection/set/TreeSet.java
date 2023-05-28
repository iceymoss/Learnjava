package collection.set;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.TreeSet<Integer>();
        set.add(400);
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println(set);
    }
}
