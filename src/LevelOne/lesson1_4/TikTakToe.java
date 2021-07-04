package LevelOne.lesson1_4;

import java.util.Random;
import java.util.Scanner;

public class TikTakToe {

    static final char EMPTY_CELL_CHAR = '-';

    public static void start() {
        char[][] field = {
                {EMPTY_CELL_CHAR, EMPTY_CELL_CHAR, EMPTY_CELL_CHAR},
                {EMPTY_CELL_CHAR, EMPTY_CELL_CHAR, EMPTY_CELL_CHAR},
                {EMPTY_CELL_CHAR, EMPTY_CELL_CHAR, EMPTY_CELL_CHAR}
        };

        drawField(field);

        do {
            doPlayerMove(field);
            drawField(field);
            if (checkLines(field, 'X') || checkDiagonal(field,'X' )) {
                System.out.println("Congratulations! You win!");
                break;
            }

            if (isDraw(field)){
                System.out.println("This is draw!");
            }

            doBotMove(field);
            drawField(field);
            if (checkLines(field, 'O') || checkDiagonal(field,'O' )) {
                System.out.println("Sorry! You loose!");
                break;
            }

            if (isDraw(field)){
                System.out.println("This is draw!");
                break;
            }

        } while (true);


    }

    // Методы проверки линий и диагоналей можно приспособить для любого размера полей.
    // Достаточно поменять число во втором условии цилов fori в каждом методе.

    public static boolean checkLines(char[][] field, char sign){
        boolean horisontal, vertical;
        for (int hor = 0; hor < 3; hor++) {
            horisontal = true;
            vertical = true;
            for (int ver = 0; ver < 3; ver++) {
                horisontal &= (field[hor][ver] == sign);
                vertical &= (field[ver][hor] == sign);
            }
            if (horisontal || vertical) return true;
        }

        return false;
    }



    public static boolean checkDiagonal(char[][] field, char sign){
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i=0; i<3; i++) {
            toright &= (field[i][i] == sign);
            toleft &= (field[3-i-1][i] == sign);
        }

        if (toright || toleft) return true;

        return false;

    }

    public static boolean isDraw(char [][] field){
        for (int v = 0; v < field.length; v++) {
            for (int h = 0; h < field.length; h++) {
                if (!(isNotEmptyCell(field, v, h))) {
                    return false;
                }

            }

        }
        return true;
    }



    public static void doBotMove(char[][] field) {
        Random random = new Random();

        int v, h;

        do {
            v = random.nextInt(3);
            h = random.nextInt(3);
        } while (isNotEmptyCell(field, v, h));

        field[v][h] = 'O';

    }

    public static void doPlayerMove(char[][] field) {
        int v, h;
        do {
            v = getCoordinate(field, 'v');
            h = getCoordinate(field, 'h');
        } while (isNotEmptyCell(field, v, h));

        field[v][h] = 'X';

    }

    static boolean isNotEmptyCell(char[][] field, int v, int h) {
        return (field[v][h] != EMPTY_CELL_CHAR);
    }

    public static int getCoordinate(char[][] field, char coordinateName) {
        Scanner scanner = new Scanner(System.in);

        int coordinate;
        do {
            System.out.printf("Please enter %s-coordinate [1...3] ...", coordinateName);
            System.out.println(" ");
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= field.length);

        return coordinate;
    }

    public static void drawField(char[][] field) {
        for (char[] chars : field) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(chars[j]);
                System.out.print(" ");

            }
            System.out.println();
        }

        System.out.println();
    }


}
