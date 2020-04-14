package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class ContangentCalculatorTest extends BaseTest {
        private double a;
        private double expectedValue;

        public ContangentCalculatorTest(double a, double expectedValue){
            this.a = a;
            this.expectedValue = expectedValue;
        }

        @Test
        public void contangentTest() {
            double result = calculator.ctg(a);
            Assert.assertEquals(result, expectedValue, 0.0);
        }

        @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {45, 1 / Math.tan(45)},
                    {90, 1 / Math.tan(90)},
                    {0, 1 / Math.tan(0)},
                    {180, 1 / Math.tan(180)},
            };
        }
    }
