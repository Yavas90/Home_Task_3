package ru.geekbrains;

public abstract class Animals {

    private String name;
    private int age;


    Animals(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public abstract void doRun(int run);
    public abstract void doJump(double jump);
    public abstract void doSwim(int swim);

    @Override
    public String toString() {
        return name;
    }
}
