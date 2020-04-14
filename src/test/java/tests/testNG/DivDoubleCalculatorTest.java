package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleCalculatorTest extends BaseTest {
    @Test(groups = {"DoubleValues","Arithmetic"}, dataProvider = "valuesForDivDoubleTest")
    public void divDoubleCalcTest(double a, double b, double expectedValue) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @Test(groups = {"DoubleValues","Arithmetic"},expectedExceptions = NumberFormatException.class)
    public void divByZeroTest() {
        calculator.div(42,0);
    }

    @DataProvider(name = "valuesForDivDoubleTest")
    public Object[][] valuesForDivDoubleTest() {
        return new Object[][]{
                {45, 10, 4.5},
                {26, -5, -5.2},
                {-6, 4, -1.5},
        };
    }
}

