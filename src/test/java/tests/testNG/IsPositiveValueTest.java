package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveValueTest extends BaseTest {

    @Test(dataProvider = "IsPositiveValue", groups = {"Arithmetic", "LongValues"})
    public void isPositiveValueCalcTest(long a) {
        Assert.assertTrue(calculator.isPositive(a), "Invalid operation");
    }

    @DataProvider(name = "IsPositiveValue")
    public Object[][] IsPositiveValue() {
        return new Object[][]{
                {4000},
                {-200},
                {0}
        };
    }
}