package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo{

    public void printMap(Map map) {
        Set<String> key = map.keySet();
        for(String k: key) {
            System.out.println("k:"+k+"v:"+map.get(k));
        }
    }

    public void printMapLamada(Map map) {
        map.forEach((key, value)->{
            System.out.println("k:"+key+"v:"+value);
        });
    }

    public void printMapTow(Map map) {
        Iterator<Map.Entry<String, Object>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Object> entry = itr.next();
            System.out.println("k:"+entry.getKey()+"v:"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMap<String, Object> student = new HashMap<>();

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

        //遍历
        HashMapDemo mapDemo = new HashMapDemo();
        mapDemo.printMap(student);
        mapDemo.printMapLamada(student);
        mapDemo.printMapTow(student);
    }
}
