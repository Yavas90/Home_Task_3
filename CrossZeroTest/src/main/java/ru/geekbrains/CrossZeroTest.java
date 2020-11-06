package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class CrossZeroTest {

    public static final int SIZE = 3;
    public static final char EMPTY = '*';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';

    public static void main(String[] args) {
        char[][] gameField = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameField[i][j] = EMPTY;
            }
        }
        printField(gameField);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {

            System.out.println("Введите куда ходить! Например 1 2");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;
            if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
                System.out.println("Вы пытаетесь походить за пределы поля!" + gameField[x][y]);
                continue;
            }
            if (gameField[x][y] != EMPTY) {
                System.out.println("Там занято " + gameField[x][y]);
                continue;
            }
            gameField[x][y] = CROSS;
            System.out.println("\nВы походили:");
            printField(gameField);
            if (isWin(gameField, CROSS)) {
                System.out.println("Вы победили!");
                break;
            } else if (!hasEmptyCells(gameField)) {
                System.out.println("Ничья!");
                break;
            }
            while (true) {
                int cx = random.nextInt(SIZE);
                int cy = random.nextInt(SIZE);
                if (gameField[cx][cy] != EMPTY) {
                    continue;
                }
                gameField[cx][cy] = ZERO;
                break;
            }
            System.out.println("\nХод компьютера:");
            printField(gameField);
            if (isWin(gameField, ZERO)) {
                System.out.println("Победил компьютер!");
                break;
            } else if (!hasEmptyCells(gameField)) {
                System.out.println("Ничья");
                break;
            }
        }
    }


    public static boolean hasEmptyCells(char[][] gameField) {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (gameField[i][j] == EMPTY)
                    return true;
            }
        }
        return false;
    }

    public static boolean isWin(char[][] gameField, char player) {

        for (int i = 0; i < SIZE; i++) {
            if (gameField[i][0] == player && gameField[i][1] == player && gameField[i][2] == player) return true;
            for (int j = 0; j < SIZE; j++) {
                if (gameField[0][j] == player && gameField[1][j] == player && gameField[2][j] == player) return true;
            }
        }
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j) {
                    if (gameField[i][j] == player) d1++;
                }
                if (i + j + 1 == SIZE) {
                    if (gameField[i][j] == player) d2++;
                }
            }
            if (d1 == SIZE || d2 == SIZE) return true;
        }


//        if (gameField[0][0] == player && gameField[0][1] == player && gameField[0][2] == player)
//            return true;
//        if (gameField[1][0] == player && gameField[1][1] == player && gameField[1][2] == player)
//            return true;
//        if (gameField[2][0] == player && gameField[2][1] == player && gameField[2][2] == player)
//            return true;
//
//        if (gameField[0][0] == player && gameField[1][0] == player && gameField[2][0] == player)
//            return true;
//        if (gameField[0][1] == player && gameField[1][1] == player && gameField[2][1] == player)
//            return true;
//        if (gameField[0][2] == player && gameField[1][2] == player && gameField[2][2] == player)
//            return true;
//
//        if (gameField[0][0] == player && gameField[1][1] == player && gameField[2][2] == player)
//            return true;
//        if (gameField[2][0] == player && gameField[1][1] == player && gameField[0][2] == player)
//            return true;

        return false;
    }

    public static void printField(char[][] gameField) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(gameField[i][j]);
            }
            System.out.println();
        }
    }
}


