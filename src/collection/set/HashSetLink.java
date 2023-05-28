package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetLink {
    public static void main(String[] args) {
        Set<String> num = new LinkedHashSet<String>();
        num.add("x001");
        num.add("x002");
        num.add("x003");
        num.add("x003");
        System.out.println(num);

        System.out.println(num.contains("x001"));
        System.out.println(num.size());

    }
}
