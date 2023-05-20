package iceymoss.animal2;

public class Cat extends Animal {
    private String habit;

    public Cat(){

    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public void catchMice(){
        System.out.println(this.getName()+"捉老鼠");
    }
}
