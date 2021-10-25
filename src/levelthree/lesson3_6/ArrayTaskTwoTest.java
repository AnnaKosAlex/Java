package levelthree.lesson3_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayTaskTwoTest {

    @Test
    void TaskTwoMustReturnTrue_whenArrayContainsOneOrFour () {
        int[] testArray = new int[10];
        testArray[0] = 1;
        testArray[1] = 4;
        for(int i = 2; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 10);
        }
        Assertions.assertTrue(ArrayTaskTwo.checkArray(testArray));
    }

    @Test
    void TaskYwoMustReturnFalse_whenArrayDoesNotContainOneOrFour() {
        int[] testArray = {8, 7, 67, 90, 37, 24};
        Assertions.assertFalse(ArrayTaskTwo.checkArray(testArray));
    }

    @Test
    void TaskTwoMustReturnFalse_whenMethodReceivedEmptyArray() {
        int[] testArray = {};
        Assertions.assertFalse(ArrayTaskTwo.checkArray(testArray));
    }

    @ParameterizedTest
    @MethodSource ("arraysContainOne")
    void TaskTwoMustReturnTrue_whenArrayContainsOne (int[] array) {
        Assertions.assertTrue(ArrayTaskTwo.checkArray(array));
    }

    static Stream<Arguments> arraysContainOne() {
        List<Arguments> out = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            int[] testArray = new int[5];
            testArray[0] = 1;
            for(int j = 1; j < testArray.length; j++) {
                testArray[j] = (int) (Math.random() * 10);
            }
            out.add(Arguments.arguments(testArray));
        }
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource ("arraysContainFour")
    void TaskTwoMustReturnTrue_whenArrayContainsFour (int[] array) {
        Assertions.assertTrue(ArrayTaskTwo.checkArray(array));
    }

    static Stream<Arguments> arraysContainFour() {
        List<Arguments> out = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            int[] testArray = new int[5];
            testArray[testArray.length - 1] = 4;
            for(int j = 0; j < testArray.length - 1; j++) {
                testArray[j] = (int) (Math.random() * 10);
            }
            out.add(Arguments.arguments(testArray));
        }
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("arraysWithoutOneAndFour")
    void TaskTwoMustReturnFalse_whenArrayDoesNotContainOneAndFour (int[] array) {
        Assertions.assertFalse(ArrayTaskTwo.checkArray(array));
    }

    static Stream<Arguments> arraysWithoutOneAndFour() {
        List<Arguments> out = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            int[] testArray = new int[5];
            for(int j = 0; j < testArray.length; j++) {
                int a = (int) (Math.random() * 10);
                if(a == 1 || a == 4) {
                    a = 5;
                }
                testArray[j] = a;
            }
            out.add(Arguments.arguments(testArray));
        }
        return out.stream();
    }
}
