package test;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Before;

import static junit.framework.TestCase.assertEquals;

public class OperandStackTest {

    private OperandStack stack;

    @Before
    public void createStack() {
        stack = new OperandStack();

    }
    @Test
    public void testNewOperandStackPeekReturnsZero() {

        OperandStack stack = new OperandStack();
        assertEquals(BigDecimal.ZERO, stack.peek());

    }

    @Test
    public void testPushingNewValueToStack() {

        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        assertEquals(value, stack.peek());

    }

    @Test
    public void testReplacingTopOfStack() {
        stack.push(new BigDecimal(22));
        BigDecimal value = new BigDecimal(66);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());

    }

    @Test
    public void testReplacingTopWithEmptyStack() {
        BigDecimal value = new BigDecimal(66);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());

    }

    @Test
    public void testPoppingValueFromStack() {
        BigDecimal value = new BigDecimal(45);
        stack.push(value);
        stack.push(new BigDecimal(55));
        stack.pop();
        assertEquals(value, stack.peek());

    }

    @Test
    public void testPoppingAnEmptyStack() {
        stack.pop();
        assertEquals(BigDecimal.ZERO, stack.peek());


    }


}
