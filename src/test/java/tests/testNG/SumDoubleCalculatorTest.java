package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalculatorTest extends BaseTest {
    @Test(dataProvider = "valuesForSumDoubleTest", groups = {"DoubleValues","Arithmetic"})
    public void sumDoubleCalcTest(double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public Object[][] valuesForSumDoubleTest() {
        return new Object[][]{
                {2.2, 3.2, 5.4},
                {2.1, -1, 1.1},
                {-1.1, 1.1, 0}
        };
    }
}

