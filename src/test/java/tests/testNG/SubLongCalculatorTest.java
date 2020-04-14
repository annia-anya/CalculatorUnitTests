package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongCalculatorTest extends BaseTest {

    @Test(groups = {"LongValues","Arithmetic"}, dataProvider = "valuesForSubLongTest")
    public void subLongCalcTest(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForSubLongTest")
    public Object[][] valuesForSubLongTest() {
        return new Object[][]{
                {23, 10, 13},
                {10, -1, 11},
                {0, 0, 0},
                {-1, -10, 9},
        };
    }
}

