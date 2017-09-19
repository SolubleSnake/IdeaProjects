package test;

import java.math.BigDecimal;

public abstract class UnaryOperation implements Operation {

    @Override
    public void apply(OperandStack values) {

        BigDecimal value1 = values.peek();
        BigDecimal value2 = values.peek();
        values.replaceTop(calculate (value1, value2));

    }

    protected abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);

}

