package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class SinCalculatorTest extends BaseTest {
        private double a;
        private double expectedValue;

        public SinCalculatorTest(double a, double expectedValue){
            this.a = a;
            this.expectedValue = expectedValue;
        }

        @Test
        public void sinCalcTest() {
            double result = calculator.sin(a);
            Assert.assertEquals(result, expectedValue, 0.0);
        }

        @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {45, Math.sin(45)},
                    {90, Math.sin(90)},
                    {0, 0},
                    {180, Math.sin(180)},

            };
        }
    }