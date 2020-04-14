package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeValueTest extends BaseTest{
    @Test(dataProvider = "IsNegativeValue", groups = {"Arithmetic", "LongValues"})
    public void isNegativeValueCalcTest(long a) {
        Assert.assertTrue(calculator.isNegative(a), "Invalid operation");
    }

    @DataProvider(name = "IsNegativeValue")
    public Object[][] IsNegativeValue() {
        return new Object[][]{
                {4000},
                {-200},
                {0}
        };
    }
}
