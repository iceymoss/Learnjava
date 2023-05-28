package collection.list;

import java.util.*;

public class ListSorter {

    //使用内部类实现自定义排序
    class compareDemo implements Comparator<Integer> {
        //70, 90, 20, 10
        //o1-o2
        //如果>0交换位置
        //如果<=0不交换位置
        @Override
        public int compare(Integer o1, Integer o2) {
            //o2-o1降序
            //o1-o2升序
            return o2-o1;
        }
    }


    //自定义排序方式
    public List<Integer> sorter(List<Integer> list) {
        Collections.sort(list, new compareDemo());
        System.out.println(list);
        return list;
    }

    public void sort(List list) {
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(12);
        list.add(200);
        list.add(300);

        ListSorter ls = new ListSorter();
        ls.sorter(list);
    }
}
