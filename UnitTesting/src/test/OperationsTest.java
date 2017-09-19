package test;

import org.junit.Test;
import org.junit.Before;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class OperationsTest {

    private Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues() {

        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(20));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(4));
    }





    @Test
    public void testAddExecution() {
        calculator.execute("+");
        assertEquals(new BigDecimal(24), calculator.getAccumulator());
    }



    @Test
    public void testSubtractExecution() {
        calculator.execute("-");
        assertEquals(new BigDecimal(16), calculator.getAccumulator());
    }

    @Test
    public void testMultiplyExecution() {
        calculator.execute("*");
        assertEquals(new BigDecimal(80), calculator.getAccumulator());

    }

    @Test
    public void testDivideExecution() {

        calculator.execute("/");
        assertEquals(new BigDecimal("0.2"), calculator.getAccumulator());
    }


}
