package iceymoss.people;

public class PersonTest {
    public static void main(String[] args) {
        Person lili = new Person();
        lili.age = 18;

        /*
        //获取内部类的方法一：：
        Person.Heart heart = new Person().new Heart();
        System.out.println(heart.beat());
         */

        /*
        //方法二：
        heart = lili.new Heart();
        System.out.println(heart.beat());
         */

        /*
        //方法三
        heart = lili.GetHeart();
        System.out.println(heart.beat());
         */


        Person.HeartStaict myheart = new Person.HeartStaict();
        System.out.println(myheart);
        myheart.say();





    }



}
