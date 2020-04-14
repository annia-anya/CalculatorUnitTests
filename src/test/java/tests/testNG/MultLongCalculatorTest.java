package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongCalculatorTest extends BaseTest {
    @Test(groups = {"LongValues","Arithmetic"}, dataProvider = "valuesForMultLongTest")
    public void multLongCalcTest(long a, long b, long expectedValue) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForMultLongTest")
    public Object[][] valuesForMultLongTest() {
        return new Object[][]{
                {23, 10, 230},
                {10, -1, -10},
                {20, 0, 0},
                {0, 42, 0},
                {-1, -10, 10},
        };
    }
}

