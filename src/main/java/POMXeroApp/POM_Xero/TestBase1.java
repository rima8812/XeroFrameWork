package POMXeroApp.POM_Xero;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@Listeners(TestListeners.ListenerTest.class)
public class TestBase1 {
	public static XeroUtility oBroUtil = new XeroUtility();
	public WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;
	String sPath = System.getProperty("user.dir")+"/ExtentReport/TestID01.html";
	
	
	@BeforeSuite
	public void launchingTheBrowser() throws Exception{
		reports = new ExtentReports(sPath);
		driver = XeroUtility.LaunchBrowser("Chrome");
	}
	
	@AfterSuite
	public void closingTest() {
		oBroUtil.ExitBrowser();
		reports.flush();
	}
	
}
