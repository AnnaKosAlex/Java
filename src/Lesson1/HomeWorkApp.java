package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords(){

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign(){
        int a = 2;
        int b = 5;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительна");
        }else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor(){
        int value = 177;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value> 0 && value <= 100){
            System.out.println("Желтый");
        }else{
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 8;
        int b = 9;
        if ( a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
}
