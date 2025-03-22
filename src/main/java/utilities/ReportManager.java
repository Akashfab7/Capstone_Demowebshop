package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // Initialize the ExtentReports and attach the reporter
    public static void initReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    // Create a new test and set it in the ThreadLocal variable
    public static synchronized void createTest(String testName) {
        test.set(extent.createTest(testName));
    }

    // Get the current test instance from ThreadLocal
    public static synchronized ExtentTest getTest() {
        return test.get(); // Return the current test for the thread
    }

    // Flush the report to write to the file
    public static void flushReport() {
        extent.flush();
    }
}
