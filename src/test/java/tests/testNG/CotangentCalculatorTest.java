package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangentCalculatorTest extends BaseTest {
    @Test(groups = {"DoubleValues","Trigonometry"}, dataProvider = "valuesForCtngDoubleTest")
    public void contangentCalcTest(double a, double expectedValue) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForCtngDoubleTest")
    public Object[][] valuesForCtngDoubleTest() {
        return new Object[][]{
                {45, 1 / Math.tan(45)},
                {90, 1 / Math.tan(90)},
                {0, 1 / Math.tan(0)},
                {180, 1 / Math.tan(180)},
        };
    }
}

