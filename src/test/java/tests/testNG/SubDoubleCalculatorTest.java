package tests.testNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleCalculatorTest extends BaseTest {
    @Test(dataProvider = "valuesForSubDoubleTest", groups = {"LongValues","Arithmetic"})
    public void subDoubleCalcTest(double a, double b, double expectesValue) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectesValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForSubDoubleTest")
    public Object[][] valuesForSubDoubleTest() {
        return new Object[][]{
                {23.14, 1.12, 22.02},
                {10.12, -1, 11.12},
                {0, 0, 0},
                {-1.5, -10.1, 8.6},
        };
    }
}
