package com.RashidG.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static com.RashidG.calculator.CalcServiceTestConstants.*;
class CalcServiceTest {

    private final CalcServiceImpl out = new CalcServiceImpl();

    @Test
    public void calculatorWelcomeMessageShouldbeWelcomeToCalculator() {
        String result = out.calculator();
        Assertions.assertEquals(WELCOME_MESSAGE,result);
    }

    @Test
    public void calculatorPlusTest() {
        String result = out.plus("1","2");
        Assertions.assertEquals("1 + 2 = 3",result);
        String result2 = out.plus("3","2");
        Assertions.assertEquals("3 + 2 = 5",result2);
    }

    @Test
    public void calculatorMinusTest() {
        String result = out.minus("1","2");
        Assertions.assertEquals("1 - 2 = -1",result);
        String result2 = out.minus("1","3");
        Assertions.assertEquals("1 - 3 = -2",result2);
    }

    @Test
    public void calculatorMultiplyTest() {
        String result = out.multiply("4","2");
        Assertions.assertEquals("4 * 2 = 8",result);
        String result2 = out.multiply("4","1");
        Assertions.assertEquals("4 * 1 = 4",result2);
    }

    @Test
    public void calculatorDivideTest() {
        String result = out.divide("4","2");
        Assertions.assertEquals("4 / 2 = 2.0",result);
        String result2 = out.divide("4","4");
        Assertions.assertEquals("4 / 4 = 1.0",result2);
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divide("2","0"));
    }



}