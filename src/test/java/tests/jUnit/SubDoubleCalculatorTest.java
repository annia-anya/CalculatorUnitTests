package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class SubDoubleCalculatorTest extends BaseTest {
        private double a;
        private double b;
        private double expectedValue;

        public SubDoubleCalculatorTest(double a, double b, double expectedValue){
            this.a = a;
            this.b = b;
            this.expectedValue = expectedValue;
        }

        @Test
        public void subDoubleCalcTest() {
            double result = calculator.sub(a, b);
            Assert.assertEquals(result, expectedValue,0.0);
        }

        @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {23.14, 1.12, 22.02},
                    {10.12, -1, 11.12},
                    {0, 0, 0},
                    {-1.5, -10.1, 8.6},
            };
        }
    }
