import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase2 {
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }
    @Test
    public void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero",0,  calculator.multiply(0,5));
        assertEquals("Multiple with zero should be zero", 0, calculator.multiply(5,0));
    }
}
