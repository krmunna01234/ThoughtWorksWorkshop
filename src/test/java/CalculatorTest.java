import com.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator cal = Calculator.getInstance();

        Assert.assertEquals(cal.add(""), 0);
        Assert.assertEquals(cal.add("1"), 1);
        Assert.assertEquals(cal.add("1,2"), 3);
    }
}
