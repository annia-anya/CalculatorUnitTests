package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLongCalculatorTest extends BaseTest {
    @Test(groups = {"LongValues","Arithmetic"}, dataProvider = "valuesForDivLongTest")
    public void divLongCalcTest(long a, long b, long expectedValue) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @Test(groups = {"LongValues"},expectedExceptions = NumberFormatException.class)
    public void divByZeroTest() {
        calculator.div(42,0);
    }

    @DataProvider(name = "valuesForDivLongTest")
    public Object[][] valuesForDivLongTest() {
        return new Object[][]{
                {40, 10, 4},
                {10, -1, -10},
                {-2, -2, 1},
                {5, 3, 1}
        };
    }
}
