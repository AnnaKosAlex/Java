package levelone.lesson1_3;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        switchSign(8);
        fillInArray();
        doubleInts();
        madeSquare(4);
        doArray(6,8);

    }

    public static int generateRandom(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static void switchSign(int size) {
        int[] ints = new int[size];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = generateRandom(2);
//            System.out.println(ints[i]);

        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                ints[i] = 1;
            } else {
                ints[i] = 0;
            }
//            System.out.println(ints[i]);
        }
    }

    public static void fillInArray() {
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
//            System.out.println(ints[i]);
        }

    }

    public static void doubleInts() {
        int[] ints = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 6) {
                ints[i] = ints[i] * 2;

            }
//            System.out.println(ints[i]);
        }
    }

    public static void madeSquare(int a) {
        int square[][] = new int[a][a];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                square[i][j] = 0;
//                System.out.print(square[i][j]);
//                System.out.print(" ");
            }
//            System.out.println();
        }

        for (int j = 0; j < a; j++) {
            for (int k = 0; k < a; k++) {
                square[j][k] = (j == k) || (j + k == a - 1) ? 1 : 0;
//                System.out.print(square[j][k]);
//                System.out.print(" ");
            }
//            System.out.println();
        }

    }

    public static int[] doArray(int len, int initialValue){
        int [] ints = new int[len];
        for (int i = 0; i < ints.length; i++) {
            ints [i] = initialValue;
//            System.out.println(ints[i]);

        }
        return ints;
    }

}
