package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalculatorTest extends BaseTest {
    @Test(groups = {"DoubleValues","Trigonometry"}, dataProvider = "valuesForSinDoubleTest")
    public void sinCalcTest(double a, double expectedValue) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForSinDoubleTest")
    public Object[][] valuesForSinDoubleTest() {
        return new Object[][]{
                {45, Math.sin(45)},
                {90, Math.sin(90)},
                {0, 0},
                {180, Math.sin(180)},

        };
    }
}

