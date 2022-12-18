import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestCase1 {
    private Calculator calculator;
    @Before
    public void setUp(){
        calculator = new Calculator();
    }
    @Test
    public void testMultiply() {
        assertEquals( "Regular multiplication should work", calculator.multiply(5,6),
                30);
    }
}
