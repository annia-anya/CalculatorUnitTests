package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowDoubleCalculatorTest extends BaseTest {

    @Test(groups = {"DoubleValues","Arithmetic"}, dataProvider = "valuesForPowDoubleTest")
    public void powCalcTest(double a, double b, double expectedValue) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForPowDoubleTest")
    public Object[][] valuesForPowDoubleTest() {
        return new Object[][]{
                {2, 2.2, Math.pow(2, 2.2)},
                {4, -2, Math.pow(4, -2)},
                {0, 0, 1},
                {-6, 4, Math.pow(-6, 4)},
                {0, 2, 0},
                {4, 0, 1},
                {152, 0.42, Math.pow(152, 0.42)}
        };
    }
}
