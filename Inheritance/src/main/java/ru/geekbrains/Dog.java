package ru.geekbrains;

public class Dog extends Animals {

    protected int run;
    protected int swim;
    protected double jump;

    public Dog(String name, int age, int run, int swim, double jump) {

        super(name, age);
        this.run = run;
        this.swim = swim;
        this.jump = jump;

    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }


    @Override
    public void doRun(int run) {
        int maxRun = 500;
        if (run <= maxRun) {
            System.out.println(getName() + " пробежал " + getRun() + " метров!");
        } else System.out.println(getName() + " так много не бегает!");
    }

    @Override
    public void doJump(double jump) {
        double maxJump = 0.5;
        if(jump <= maxJump) {
            System.out.println(getName() +  " прыгнул на " + getJump() + " метра!");
        } else System.out.println(getName() + " не допрыгнет!");
    }

    @Override
    public void doSwim(int swim) {
        int maxSwim = 10;
        if (swim <= maxSwim) {
            System.out.println(getName() + " проплыл " + getSwim() + " метров!");
        } else System.out.println("Это слишком далеко для " + getName());
    }
}
