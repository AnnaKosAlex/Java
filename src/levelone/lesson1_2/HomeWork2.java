package levelone.lesson1_2;

public class HomeWork2 {
    public static void main(String[] args) {
        checkNumber(9);
        checkSign(7);
        checkSum(8, -80);
        checkYear(800);

        System.out.println();

    }

    static boolean checkSum(int a, int b) {
        if ((a + b) > 10 && (a + b) <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    static String checkSign(int a) {
        if (a >= 0) {
            System.out.println("Positive");
            return "Positive";
        } else {
            System.out.println("Negative");
            return "Negative";
        }
    }

    static boolean checkNumber(int a) {
        if (a >= 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    static void printLine(String s, int a) {
        s = "Hi";
        a = 7;
        for (int i = 0; i <= a; i++) {
            System.out.println(s);
        }
    }

    static String checkYear(int i) {
        if (!(i % 4 == 0) || !(i % 100 == 0) || !(i % 400 == 0)) {
            System.out.println("false");
            return "false";
        } else {
            System.out.println("true");
            return "true";
        }
    }
}
