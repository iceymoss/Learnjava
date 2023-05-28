package collection.list;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        //LinkedList底层是使用链表实现的
        LinkedList<String> bookList = new LinkedList<>();
        bookList.add("三国演义");
        bookList.add("水浒传");

        //向指定小标插入数据
        bookList.add(0,"西游记");
        bookList.add("红楼梦");

        //list.get()方法插入下标位置
        System.out.println(bookList.get(1));

        //修改指定位置的值，返回原始位置的数据
        String res = bookList.set(0, "西游记后传");
        System.out.println("bookList："+bookList +"res:"+res);

        //移除数据
        bookList.remove("西游记后传");
        bookList.remove(0);
        System.out.println("bookList："+bookList);

        //获取长度
        System.out.println(bookList.size());

        bookList.addLast("明朝那些事");
        bookList.addFirst("中国历史");

        //总结：ArrayList底层是数组实现的，对于大量的读取数据效率高
        //     LinkedList底层是有链表实现的，适合进行插入数据



    }
}
