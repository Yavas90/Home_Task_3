package ru.geekbrains;

public class Plate {



    private int food;

    Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food -= food;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void getFood(int food) {
        this.food -= food;
        int add = 50;
        if (this.food <= 0) {
            this.food += add;
        }
    }
}
