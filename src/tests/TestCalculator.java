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
        assertEquals(calculator.displayNumber(), 0.0, 0.001);

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
        calculator.numberPressed(5);

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

    @Test
    public void clearTest() {
        calculator.numberPressed(3);
        calculator.addPressed();
        calculator.numberPressed(4);
        calculator.equalsPressed();
        calculator.clearPressed();

        assertEquals(calculator.displayNumber(), 0.0, 0.001);
    }

    @Test
    public void decimalAppendTest() {
        calculator.decimalPressed();
        calculator.numberPressed(5);
        assertEquals(calculator.displayNumber(), 0.5, 0.001);
    }

    @Test
    public void equalsOverRepeating() {
        calculator.numberPressed(8);
        calculator.numberPressed(0);
        calculator.subtractPressed();
        calculator.numberPressed(1);
        calculator.numberPressed(0);
        calculator.equalsPressed();
        calculator.equalsPressed();
        calculator.equalsPressed();
        calculator.equalsPressed();
        assertEquals(calculator.displayNumber(), 40.0, 0.001);
    }

    @Test
    public void mutipleDecimal() {
        calculator.numberPressed(1);
        calculator.numberPressed(2);
        calculator.decimalPressed();
        calculator.decimalPressed();
        calculator.numberPressed(5);
        calculator.decimalPressed();
        calculator.decimalPressed();
        calculator.numberPressed(0);
        calculator.decimalPressed();
        calculator.numberPressed(5);

        assertEquals(calculator.displayNumber(), 12.505, 0.001);
    }
    }
