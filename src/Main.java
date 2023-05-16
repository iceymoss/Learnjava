// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
//        }

        //变量
        int a,b;
        a = 1;
        b = 2;
        System.out.println("\n"+ b+a);

        //类型转换
        double d = 1.12;
        float f = 1.1f; //浮点默认是double
        if (d > f ) {
            System.out.println(d);
        }
        d = f;
        f = (float)d;
        System.out.println(f);








    }
}