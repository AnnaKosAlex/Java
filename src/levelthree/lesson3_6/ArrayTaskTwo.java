package levelthree.lesson3_6;

public class ArrayTaskTwo {

    public static boolean checkArray(int[] array) {
        int checkNumbersCount = 0;
        for (int j : array) {
            if (j == 1 || j == 4) {
                checkNumbersCount++;
            }
        }

        return checkNumbersCount > 0;
    }
}
