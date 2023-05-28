package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

     class recordCoparetor  implements Comparator<String> {
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }

    public void sort() {
        TreeMap<String, Object> student = new TreeMap<>(new recordCoparetor());
        student.put("name", "iceymoss");
        student.put("age", 18);
        ArrayList<String> course = new ArrayList<>();
        course.add("java" );
        course.add("golang");
        course.add("python");
        student.put("course", course);
        System.out.println(student);
    }
    public static void main(String[] args) {
        TreeMapDemo map = new TreeMapDemo();
        map.sort();




    }
}
