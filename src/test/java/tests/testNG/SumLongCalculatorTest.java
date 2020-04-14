package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongCalculatorTest extends BaseTest {

    @Test(dataProvider = "valuesForSumLongTest", groups = {"LongValues","Arithmetic"})
    public void sumLongCalcTest(long a, long b, long expectedValue) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation");
    }

    @DataProvider(name = "valuesForSumLongTest")
    public Object[][] valuesForSumLongTest() {
        return new Object[][]{
                {10, 23, 33},
                {-1, 10, 9},
                {0, 0, 0},
                {-1, -10, -11}
        };
    }
}




