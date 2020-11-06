package ru.geekbrains;

public class Animals {

    private String name;
    private int appetite;

    Animals(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
