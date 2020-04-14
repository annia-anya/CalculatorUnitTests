package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class CosCalculatorTest extends BaseTest {
        private double a;
        private double expectedValue;

        public CosCalculatorTest(double a, double expectedValue){
            this.a = a;
            this.expectedValue = expectedValue;
        }

        @Test
        public void cosCalcTest() {
            double result = calculator.cos(a);
            Assert.assertEquals(result, expectedValue, 0.0);
        }

        @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {45, Math.cos(45)},
                    {90, Math.cos(90)},
                    {0, Math.cos(0)},
                    {180, Math.cos(180)},

            };
        }
    }
