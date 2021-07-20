package leveltwo.lesson2_2;

public class Main {
    public static void main(String[] args) {

        String[][] values = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };

        int sum = matrixSumCalculation(values);
        System.out.println("The sum is " + sum);

    }

    static int matrixSumCalculation(String[][] value) {

        checkSize(value.length);

        for (int i = 0; i < value.length; i++) {
            checkSize(value[i].length);
        }

        int sum = 0;

        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length; j++) {
                try {
                    sum += Integer.parseInt(value[i][j]);
                } catch (NumberFormatException e) {
                    String message = String.format("We can ron parse this value[%s][%s]", i, j);
                    throw new MyArrayDataException(message, e);
                }
            }
        }

        return sum;
    }

    private static void checkSize(int lenght) {
        if (lenght != 4) {
            throw new MyArraySizeException("Array must be 4*4");
        }
    }

}
