import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        double sum = calculator.evaluate(1.0,2.0,"+");
        assertEquals(3, sum,0);
        double negative_minus = calculator.evaluate(1.0,2.0,"-");
        assertEquals(-1, negative_minus,0);
        double positive_minus = calculator.evaluate(5.0,2.0,"-");
        assertEquals(3, positive_minus,0);
        double multiply = calculator.evaluate(5.0,2.0,"*");
        assertEquals(10.0, multiply,0);
        double invalide=calculator.evaluate(1.0,2.0,"#");
        assertEquals(0,invalide,0);
    }
}
