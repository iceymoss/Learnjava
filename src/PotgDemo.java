
public class PotgDemo {

    //文档使用：使用命令：javadoc -d doc PotgDemo.java
    /**
     * 方法说明：swap方法用于交换两个值
     * @auther:iceymoss
     * @version:1.1
     *
     */
    //函数传参问题: 传值是copy一份数据到函数
    public void swap(int x, int y) {
       int temp = x;
       x = y;
       y = temp;
        System.out.println("num1:"+x+"; "+"num2:"+y);
    }

    //修改值：值传递
    public void add(int n) {
        n++;
        System.out.println("add:"+n);
    }

    //更改数组的值:本质上都是值传递 数组是引用数据类型，就是将arr的地址copy到函数，所以他们指向了同一地址
    public void exchangeArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 10;

        PotgDemo p = new PotgDemo();
        p.swap(num1, num2);
        System.out.println("num1:"+num1+"; "+"num2:"+num2);

        int n = 10;
        p.add(n);
        System.out.println("n="+n);

        int[] arr = {1, 2, 3, 4, 5};
        p.exchangeArr(arr);
        for(int m: arr) {
            System.out.println("arr:"+m);
        }


    }
}
