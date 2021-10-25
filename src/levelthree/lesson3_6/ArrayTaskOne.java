package levelthree.lesson3_6;

import java.util.Arrays;

public class ArrayTaskOne {

    public static int[] getValueAfterLastFour(int[] array) {
        int lastFourIndex = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 4) {
                lastFourIndex = i;
            }
        }

        if(lastFourIndex == -1) {
            throw new RuntimeException();
        }

        return Arrays.copyOfRange(array, lastFourIndex + 1, array.length);
    }



}
