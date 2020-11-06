package ru.geekbrains;

public class Cats extends Animals {



    Cats(String name, int appetite) {
        super(name, appetite);
    }

    public void eat(Plate plate) {

            if (plate.getFood() > getAppetite()) {
                System.out.println(getName() + " поел!");
                plate.setFood(getAppetite());

            } else if (plate.getFood() < getAppetite()) {
                System.out.println(getName() + " орет, что еды мало!");
                plate.addFood(50);

            }
    }


    @Override
    public String toString() {
        return getName();
    }
}
