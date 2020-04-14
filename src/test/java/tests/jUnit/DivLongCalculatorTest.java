package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class DivLongCalculatorTest extends BaseTest {
        private long a;
        private long b;
        private long expectedValue;

        public DivLongCalculatorTest(long a, long b, long expectedValue) {
            this.a = a;
            this.b = b;
            this.expectedValue = expectedValue;
        }

        @Test
        public void divLongCalcTest() {
            long result = calculator.div(a, b);
            Assert.assertEquals(result, expectedValue);
        }

        @Test(expected = NumberFormatException.class)
        public void divByZeroCalcTest() {
            calculator.div(42,0);
        }


        @Parameterized.Parameters(name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {40, 10, 4},
                    {10, -1, -10},
                    {-2, -2, 1},
            };
        }
    }

