package levelthree.lesson3_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayTaskOneTest {

    @Test
    void TaskOneMustThrowException_whenThereIsNoValueFourInArray () {
        int[] testArray = {3, 5, 7, 9, 11, 14};
        Assertions.assertThrows(RuntimeException.class, () -> ArrayTaskOne.getValueAfterLastFour(testArray));
    }

    @Test
    void TuskOneMustGetEmptyArray_whenFourIsLastElementInArray () {
        int[] emptyArray = new int[0];
        int[] testArray = {3, 5, 7, 9, 11, 4};
        Assertions.assertArrayEquals(emptyArray, ArrayTaskOne.getValueAfterLastFour(testArray));
    }


    @ParameterizedTest
    @MethodSource("arraysForChecking")
    void TaskOneMustGetArrayAfterLastNumberFour(int[] initArray, int[] resultArray) {
        Assertions.assertArrayEquals(resultArray, ArrayTaskOne.getValueAfterLastFour(initArray));
    }

    static Stream<Arguments> arraysForChecking() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[] {6, 2, 6, 4, 6}, new int[] {6}));
        out.add(Arguments.arguments(new int[] {2, 4, 6, 4, 8, 0}, new int[] {8, 0}));
        out.add(Arguments.arguments(new int[] {3, 4, 3, 7, 7}, new int[] {3, 7, 7}));
        out.add(Arguments.arguments(new int[] {4, 9, 9, 7, 5}, new int[] {9, 9, 7, 5}));
        return out.stream();
    }
}
