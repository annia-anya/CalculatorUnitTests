package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentCalculatorTest extends BaseTest {
    @Test(groups = {"DoubleValues", "Trigonometry"}, dataProvider = "valuesForTangentTest")
    public void tangentCalcTest(double a, double expectedValue) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForTangentTest")
    public Object[][] valuesForTangentTest() {
        return new Object[][]{
                {45, Math.tan(45)},
                {90, Math.tan(90)},
                {0, Math.tan(0)},
                {180, Math.tan(180)},
        };
    }
}
