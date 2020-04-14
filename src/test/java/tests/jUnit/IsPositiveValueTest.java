package tests.jUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class IsPositiveValueTest extends BaseTest {
        private long a;

        public IsPositiveValueTest(long a){
            this.a = a;
        }

        @Test
        public void isPositiveValueCalcTest() {

            Assert.assertTrue("Invalid operation", calculator.isPositive(a));
        }

        @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
        public static Object[][] data() {
            return new Object[][]{
                    {4000},
                    {-200},
                    {0}

            };
        }
    }
