package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DivDoubleCalculatorTest extends BaseTest {
    private double a;
    private double b;
    private double expectedValue;

    public DivDoubleCalculatorTest(double a, double b, double expectedValue) {
        this.a = a;
        this.b = b;
        this.expectedValue = expectedValue;
    }

    @Test
    public void divDoubleCalcTest() {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, 0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void divByZeroCalcTest() {
        calculator.div(42,0);
    }


    @Parameterized.Parameters(name = "{index}: Calculator.sub({0},{1})={2}")
    public static Object[][] data() {
        return new Object[][]{
                {45, 10, 4.5},
                {26, -5, -5.2},
                {-6, 4, -1.5},
        };
    }
}
