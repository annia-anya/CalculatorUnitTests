package tests.jUnit;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SqrtDoubleCalculatorTest extends BaseTest{
    private double a;
    private double expectedValue;

    public SqrtDoubleCalculatorTest(double a, double expectedValue) {
        this.a = a;
        this.expectedValue = expectedValue;
    }
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Test
    public void sqrtCalcTest(){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue,0.0);
    }

    @Parameterized.Parameters (name = "{index}: Calculator.sub({0},{1})={2}")
    public static Object[][] data() {
        return new Object[][]{
                {4, Math.sqrt(4)},
                {16, Math.sqrt(16)},
                {-4, Math.sqrt(-4)}
        };
    }
}

