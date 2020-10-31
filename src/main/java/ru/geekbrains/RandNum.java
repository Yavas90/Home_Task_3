package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class RandNum {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int answer = rand.nextInt(9);
        checkAnswers(answer);
    }

    public static void checkAnswers(int answer) {
        while (true) {
                System.out.println("Угадайте число от 0 до 9!");
                System.out.println("Введите число:");
            for (int counter = 3; counter > 0; ) {
                int userAnswer = scanner.nextInt();
                counter--;
                if (userAnswer == answer) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (counter == 0) {
                    System.out.println("Вы проиграли!");
                    System.out.println("У вас больше не осталось попыток!");
                } else if (userAnswer > answer) {
                    System.out.println("Загаданное число меньше!");
                    System.out.println("У вас осталось " + counter + " попыток!");
                } else if (userAnswer < answer) {
                    System.out.println("Загаданное число больше!");
                    System.out.println("У вас осталось " + counter + " попыток!");
                }
            }
                System.out.println("\n" + "Хотите сыграть еще раз?");
                System.out.println("1. Да");
                System.out.println("0. Нет");
                int choice = scanner.nextInt();
                if (choice == 1) {
                } else break;
        }
    }
}

