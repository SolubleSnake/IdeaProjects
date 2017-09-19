package test;

import java.math.BigDecimal;

public class MultiplyOperation extends BinaryOperation {




        @Override
        protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
            return value1.multiply(value2);
        }


}
