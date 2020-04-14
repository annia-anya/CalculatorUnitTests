package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListeners implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        System.out.println("On test success: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("On test failure: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("On test skipped: " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        System.out.println("On test start: " + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("On test finish: " + context.getName());
    }
}



