package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class SumDoubleCalculatorTest extends BaseTest {
        private double a;
        private double b;
        private double expectedValue;

        public SumDoubleCalculatorTest(double a, double b, double expectedValue){
            this.a = a;
            this.b = b;
            this.expectedValue = expectedValue;
        }

        @Test
        public void sumDoubleCalcTest() {
            double result = calculator.sum(a, b);
            Assert.assertEquals(result, expectedValue, 0.0);
        }

        @Parameterized.Parameters(name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {2.2, 3.2, 5.4},
                    {2.1, -1, 1.1},
                    {-1.1, 1.1, 0}
            };
        }
    }
