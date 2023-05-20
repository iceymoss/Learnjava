package top.iceymoss.test;

import iceymoss.animal.*; //加载该包小的所有类
import iceymoss.car.Car; //加载该包下的指定类
public class Test {
    public static void main(String[] args) {
        Car benz = new Car();
        benz.setName("C63AMG");
        benz.setCountry("德国");
        benz.setPrice(1240000);
        benz.setType("轿跑");
        benz.setDate(2021);
        System.out.println(benz.getName()+benz.getCountry()+benz.getPrice()+benz.getDate()+benz.getType());

    }
}

