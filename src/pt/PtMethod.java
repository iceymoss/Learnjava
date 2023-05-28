package pt;

import java.util.ArrayList;
import java.util.List;

public class PtMethod {
    //泛型方法
    public <T> List<T> ransfArrToList(T[] arr) {
        List<T> list = new ArrayList<>();
        for(T item: arr) {
            list.add(item);
        }
        return list;
    }
    public static void main(String[] args) {
        PtMethod pm = new PtMethod();
        String[] arr = {"A", "B", "C", "D", "E", "F"};
        System.out.println(pm.ransfArrToList(arr));
    }
}
