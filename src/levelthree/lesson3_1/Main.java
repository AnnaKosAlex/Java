package levelthree.lesson3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.putIntoBox(new Apple());
        appleBox.putIntoBox(new Apple());
        appleBox.putIntoBox(new Apple());

        orangeBox.putIntoBox(new Orange());
        orangeBox.putIntoBox(new Orange());


        System.out.println("appleBox weight = " + appleBox.getWeight());
        System.out.println("orangeBox weight = " + orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.reputFruits(newAppleBox);

        System.out.println("appleBox weight = " + appleBox.getWeight());
        System.out.println("newAppleBox weight = " + newAppleBox.getWeight());

        Box<Orange> newOrangeBox = new Box<>();
        orangeBox.reputFruits(newOrangeBox);

        System.out.println("orangeBox weight = " + orangeBox.getWeight());
        System.out.println("newOrangeBox weight = " + newOrangeBox.getWeight());

    }

    public static <T> void changeArray(T[] array) {
        for (int i = 0; i < array.length - 1; i = i + 2) {
            T a = array[i];
            array[i] = array[i + 1];
            array[i + 1] = a;
        }
    }

    public static <T> List<T> arrayToArrayList(T[] array) {
        List<T> newArrayList = new ArrayList<>();
        Collections.addAll(newArrayList, array);
        return newArrayList;
    }
}
