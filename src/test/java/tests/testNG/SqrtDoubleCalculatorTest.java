package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtDoubleCalculatorTest extends BaseTest {
    @Test(groups = {"DoubleValues","Arithmetic"}, dataProvider = "valuesForSqrtDoubleTest")
    public void sqrtDoubleCalcTest(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForSqrtDoubleTest")
    public Object[][] valuesForSqrtDoubleTest() {
        return new Object[][]{
                {4, Math.sqrt(4)},
                {16, Math.sqrt(16)},
                {-4, Math.sqrt(-4)}
        };
    }
}


