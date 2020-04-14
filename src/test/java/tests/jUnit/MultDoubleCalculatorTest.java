package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class MultDoubleCalculatorTest extends BaseTest {
        private double a;
        private double b;
        private double expectedValue;

        public MultDoubleCalculatorTest(double a, double b, double expectedValue){
            this.a = a;
            this.b = b;
            this.expectedValue = expectedValue;
        }

        @Test
        public void multDoubleCalcTest() {
            double result = calculator.sub(a, b);
            Assert.assertEquals(result, expectedValue,0.0);
        }

        @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
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