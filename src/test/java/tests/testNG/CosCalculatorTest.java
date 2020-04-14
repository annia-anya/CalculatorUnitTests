package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalculatorTest extends BaseTest {
    @Test(groups = {"DoubleValues","Trigonometry"}, dataProvider = "valuesForCosDoubleTest")
    public void cosCalcTest(double a, double expectedValue) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForCosDoubleTest")
    public Object[][] valuesForCosDoubleTest() {
        return new Object[][]{
                {45, Math.cos(45)},
                {90, Math.cos(90)},
                {0, Math.cos(0)},
                {180, Math.cos(180)},
        };
    }
}