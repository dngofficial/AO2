package tests;

import calculator.model.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCalculator {

    private Calculator calculator = new Calculator();

    @Test
    public void testCalculator() {
        assertTrue(true);
    }

    @Test
    public void test0Calculator()
    {
        assertTrue(calculator.displayNumber() == 0.0);
    }

    @Test
    public void testingNumberPress()
    {
        calculator.numberPressed(4);
        calculator.numberPressed(6);
        calculator.numberPressed(1);

        assertEquals(calculator.displayNumber(), 461.0, 0.001);
    }

    @Test
    public void testCalculatorDivision() {
        calculator.numberPressed(2);
        calculator.numberPressed(5);
        calculator.dividePressed();
        System.out.println(calculator.getState().getFirst_number());
        calculator.numberPressed(5);
        System.out.println(calculator.getCurrentString());

        calculator.equalsPressed();

        assertEquals(calculator.displayNumber(), 5.0, 0.001);
    }

    @Test
    public void testEqualsAgain() {
        calculator.numberPressed(2);
        calculator.numberPressed(0);
        calculator.addPressed();
        calculator.numberPressed(1);
        calculator.numberPressed(5);
        calculator.equalsPressed();
        calculator.dividePressed();
        calculator.numberPressed(1);
        calculator.numberPressed(0);
        calculator.equalsPressed();

        assertEquals(calculator.displayNumber(), 3.5, 0.001);
    }

    @Test
    public void testEqualsAgain2() {
        calculator.numberPressed(3);
        calculator.addPressed();
        calculator.numberPressed(4);
        calculator.equalsPressed();
        calculator.multiplyPressed();
        calculator.numberPressed(2);
        calculator.equalsPressed();

        assertEquals(calculator.displayNumber(), 14.0, 0.001);
    }




    }
