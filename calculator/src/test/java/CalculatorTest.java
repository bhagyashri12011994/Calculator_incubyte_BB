import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        double sum = calculator.evaluate(1.0,2.0,"+");
        assertEquals(3, sum,0);
    }
}
