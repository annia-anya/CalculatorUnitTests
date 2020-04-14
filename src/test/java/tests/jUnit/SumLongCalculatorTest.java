package tests.jUnit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class SumLongCalculatorTest extends BaseTest {
    private long a;
    private long b;
    private long expectedValue;

    public SumLongCalculatorTest(long a, long b, long expectedValue){
        this.a = a;
        this.b = b;
        this.expectedValue = expectedValue;
    }

    @Test
    public void sumLongCalcTest() {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue);
    }

    @Parameterized.Parameters(name = "{index}: Calculator.sub({0},{1})={2}")
    public static Object[][] data() {
        return new Object[][]{
                {10, 23, 33},
                {-1, 10, 9},
                {0, 0, 0},
                {-1, -10, -11}
        };
    }
}


