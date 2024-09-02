package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport {
	public static ExtentSparkReporter htmlReporter; // Responsible for look
	public static ExtentReports extent; // Responsible for entries
	public static ExtentTest test; // Responsible for test status pass/fail

	
	public static void setup() {

		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/mayBatchReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report 14th May batch");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("hostname", "LocalHost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("browserName", "Chrome");
		extent.setSystemInfo("testername", "sayli");
	}

	public static void endReport() {
		extent.flush(); //flush output to the html file--
	}

}
