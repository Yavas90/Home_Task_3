package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cats[] cat = new Cats[3];
        cat[0] = new Cats("Сильнокусь",50);
        cat[1] = new Cats("Пушистохват", 60);
        cat[2] = new Cats("Царапкин", 40);

        Plate[] plate = new Plate[3];
        plate[0] = new Plate(60);
        plate[1] = new Plate(70);
        plate[2] = new Plate(50);

        System.out.println("Коты пошли есть!");


        for (int i = 0; i < cat.length; i++) {
            for (int j = 0; j < plate.length; j++) {
                    cat[i].eat(plate[i]);

            }

        }

    }
}
