package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {

        //使用ArrayList的容量是动态的，会自动扩容，类似与golang里面的slice
        ArrayList<String> bookList = new ArrayList<>();
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

        //遍历
        for(int i = 0; i < bookList.size(); i++) {
            System.out.println("arr:"+bookList.get(i));
        }

        for(String book: bookList) {
            System.out.println("book"+book);
        }

        //lamada表达式
        bookList.forEach(book->{
            System.out.println(book);
        });

        Iterator<String> itr = bookList.iterator();
        while(itr.hasNext()) {
            String book = itr.next();
            System.out.println(book);
        }

    }


}
