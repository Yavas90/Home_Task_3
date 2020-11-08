package ru.geekbrains;

public class Introduction {
    public static void main(String[] args) {

        Staff[] employee = new Staff[5];
        employee[0] = new Staff("Diego", "Singer", "Diego@mail.ru", 5642, 6000, 25);
        employee[1] = new Staff("Ronaldo", "Guitar", "Ronaldo@mail.ru", 5642, 5500, 45);
        employee[2] = new Staff("Ivan", "BasGuitar", "HardIvan@gmail.ru", 5642, 7000, 42);
        employee[3] = new Staff("Cris", "Drummer", "CrisDrumm@mail.ru", 5642, 6500, 36);
        employee[4] = new Staff("Anna", "Pianist", "LittleBoss@mail.ru", 5642, 4500, 20);


        for (int i = 0; i < employee.length; i++) {
            if (employee[i].isTooOld()) {
                System.out.println(employee[i].toString());
            }
        }


    }
}
