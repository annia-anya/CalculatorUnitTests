package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleCalculatorTest extends BaseTest {
    @Test(groups = {"DoubleValues","Arithmetic"}, dataProvider = "valuesForMultDoubleTest")
    public void multDoubleCalcTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid operation");
    }

    @DataProvider(name = "valuesForMultDoubleTest")
    public Object[][] valuesForMultDoubleTest() {
        return new Object[][]{
                {2.3, 1.1, 2.53},
                {1.5, -1.1, -1.65},
                {0, 0, 0},
                {1, 0, 0},
                {2, 2.5, 5},
                {-7.7, -3.2, 24.64}
        };
    }
}


