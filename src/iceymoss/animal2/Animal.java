package iceymoss.animal2;

public class Animal {
    //属性:昵称，年龄，体重，品种
    private String name;
    private int month;
    private String species;

    public void run() {
        System.out.println(this.name+"run");
    }

    public void eat() {
        System.out.println(this.name+"eat");
    }

    public void eat(String name) {
        System.out.println(name+"在吃东西");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


}


