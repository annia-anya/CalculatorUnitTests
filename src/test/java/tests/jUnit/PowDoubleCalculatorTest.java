package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


    @RunWith(Parameterized.class)
    public class PowDoubleCalculatorTest extends BaseTest{
        private double a;
        private double b;
        private double expectedValue;

        public PowDoubleCalculatorTest(double a, double b, double expectedValue) {
            this.a = a;
            this.b = b;
            this.expectedValue = expectedValue;
        }

        @Test
        public void powCalcTest(){
            double result = calculator.pow(a,b);
            Assert.assertEquals(result, expectedValue,0.0);
        }

        @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {2, 2.2, Math.pow(2, 2.2)},
                    {4, -2, Math.pow(4, -2)},
                    {0, 0, 1},
                    {-6, 4, Math.pow(-6, 4)},
                    {0, 2, 0},
                    {4, 0, 1},
                    {152, 0.42, Math.pow(152, 0.42)}
            };
        }
    }


