package collection.map;

import java.util.LinkedHashMap;
import java.util.Objects;

public class LinkHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Object> student = new LinkedHashMap<>();
        //添加键值对
        student.put("name", "iceymoss");
        student.put("age", 18);
        student.put("live", "WuXiCity");

        //返回键值对的数量
        System.out.println(student.size());
        System.out.println("student:"+student);

        //判断是否有key
        System.out.println(student.containsKey("name"));

        //判断是否有value
        System.out.println(student.containsValue(18));

        //移除指定key并返回value
        String live = (String)student.remove("live");
        System.out.println(live);

    }
}
