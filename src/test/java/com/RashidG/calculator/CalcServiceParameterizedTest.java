package com.RashidG.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.RashidG.calculator.CalcServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalcServiceParameterizedTest {

    private final CalcServiceImpl out = new CalcServiceImpl();

    @Test
    public void calculatorWelcomeMessageShouldbeWelcomeToCalculator() {
        String result = out.calculator();
        Assertions.assertEquals(WELCOME_MESSAGE,result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDividedByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> out.divide(POSITIVE_INT,ZERO)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplicationTests() {
        return Stream.of(
                Arguments.of("2", "3", "2 * 3 = 6"),
                Arguments.of("2", "4", "2 * 4 = 8")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplicationTests")
    public void shouldReturnCorectAnswerForMultiplication(String num1, String num2, String expectedMessage) {
        String result = out.multiply(num1, num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForAdditionTests() {
        return Stream.of(
                Arguments.of("2", "3", "2 + 3 = 5"),
                Arguments.of("2", "4", "2 + 4 = 6")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForAdditionTests")
    public void shouldReturnCorectAnswerForAddition(String num1, String num2, String expectedMessage) {
        String result = out.plus(num1, num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForSubtractionTests() {
        return Stream.of(
                Arguments.of("2", "3", "2 - 3 = -1"),
                Arguments.of("2", "4", "2 - 4 = -2")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTests")
    public void shouldReturnCorectAnswerForSubtraction(String num1, String num2, String expectedMessage) {
        String result = out.minus(num1, num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of("2", "4", "2 / 4 = 0.5"),
                Arguments.of("6", "3", "6 / 3 = 2.0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    public void shouldReturnCorectAnswerForDivision(String num1, String num2, String expectedMessage) {
        String result = out.divide(num1, num2);
        assertEquals(expectedMessage, result);
    }
}
