package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SubLongCalculatorTest extends BaseTest {
    private long a;
    private long b;
    private long expectedValue;

    public SubLongCalculatorTest(long a, long b, long expectedValue){
        this.a = a;
        this.b = b;
        this.expectedValue = expectedValue;
    }

    @Test
    public void subLongCalcTest() {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue);
    }

    @Parameterized.Parameters(name = "{index}: Calculator.sub({0},{1})={2}")
    public static Object[][] data() {
        return new Object[][]{
                {23, 10, 13},
                {10, -1, 11},
                {0, 0, 0},
                {-1, -10, 9},
        };
    }
}
