package pt;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public void listTest() {
        //不使用泛型，编译器不知道他究竟是什么类型，默认都是obj
        ArrayList list = new ArrayList();
        list.add("miceyoss");
        list.add(18);
        //String info = list.get(0);
        Object o = list.get(0);
    }

    public void listTestTow() {
        //使用泛型
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("golang");
        list.add("python");
        String s = list.get(0);
        Object S1= list.get(0);
    }



    public static void main(String[] args) {

    }
}
