//final class 不允许有子类：public final class \
//final 方法：不允许在子类中被重写，但是可以被子类继承使用
//final 方法内局部变量，只要在具体使用前进行赋值即可
public final class Animal {
    private String name;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void est(){
        final int temp = 10;
        //当局部变量使用final之后，不能二次赋值了
        //temp = 20;
        System.out.println(this.name+"会吃");
    }
}
