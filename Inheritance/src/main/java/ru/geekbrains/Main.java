package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Morgenmuffel", 10, 200, 0, 2);
        Cat cat1 = new Cat("Silnokys", 12, 150, 0, 1);
        Dog dog = new Dog("Borov", 5, 500, 10, 0.5);
        Dog dog1 = new Dog("Rex", 3, 400, 8, 1);

        int sumCat = 0;
        int sumDog = 0;

        cat.doRun(cat.getRun());
        cat.doJump(cat.getJump());
        cat.doSwim(cat.getSwim());
        cat.toString();
        sumCat++;

        System.out.println(" ");

        cat1.doRun(cat1.getRun());
        cat1.doJump(cat1.getJump());
        cat1.doSwim(cat1.getSwim());
        cat1.toString();
        sumCat++;

        System.out.println(" ");

        dog.doJump(dog.getJump());
        dog.doRun(dog.getRun());
        dog.doSwim(dog.getSwim());
        dog.toString();
        sumDog++;

        System.out.println(" ");

        dog1.doJump(dog1.getJump());
        dog1.doRun(dog1.getRun());
        dog1.doSwim(dog1.getSwim());
        dog1.toString();
        sumDog++;

        System.out.println(" ");
        System.out.println("Всего животных: " + (sumCat + sumDog) + ", из них " + sumCat + " кота и " + sumDog + " собаки!");


    }
}
