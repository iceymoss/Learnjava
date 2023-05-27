package error;

public class TryDemoLink {

    //异常链：将出现异常的调用一层一层的往外传
    public static void testOne() throws Exception {
        throw new Exception("我是第一个异常");
    }

    public static  void testTow() throws Exception {
        try {
            testOne();
        }catch (Exception e) {
            throw new Exception("我是第二个异常", e);
        }
    }

    public static  void testThree() throws Exception {
        try {
            testTow();
        }catch (Exception e) {
            throw new Exception("我是第三个异常", e);
        }
    }
    public static void main(String[] args) {
        try {
            testThree();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }


}
