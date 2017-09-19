package test;

import java.math.BigDecimal;
import static java.math.BigDecimal.ZERO;
import static junit.framework.TestCase.assertEquals;



public class Calculator {

    private OperandStack values = new OperandStack();

    public BigDecimal getAccumulator() {

        return values.peek();
    }

    public void setAccumulator(BigDecimal value) {

        values.replaceTop(value);

    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {

        values.pop();
    }


    public void multiply() {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(value2.multiply(value1));
    }

    public void execute(String op) {
        Operation operation = null;
       if ("+".equals(op))
           operation = new AddOperation();
       else if ("-".equals(op))
           operation = new SubtractOperation();
       else if ("*".equals(op))
           operation = new MultiplyOperation();
       else if ("/".equals(op))
           operation = new DivideOperation();
       operation.apply(values);
    }

    public void divide() {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(value2.divide(value1));
    }
}
