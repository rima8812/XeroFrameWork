package Login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import POMXeroApp.POM_Xero.TestBase1;


public class TestID01 extends TestBase1{
	LoginPage objLogin;
	Properties prop;
	 String propertyFilePath= System.getProperty("user.dir")+"/src/main/java/Properties/TestData.properties";
	 
	 
	
	 public TestID01(){
		 BufferedReader reader;
		 try {
		 reader = new BufferedReader(new FileReader(propertyFilePath));
		 prop = new Properties();
		 try {
			 prop.load(reader);
		 reader.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		 } 
	 }
	
	@Test(priority=1)
	public void TestID01A() throws Exception {
		 logger = reports.startTest("TestID01A");
		objLogin=new LoginPage(driver);
	
		driver.get(prop.getProperty("td_URL"));
		driver.manage().window().maximize();
		
		objLogin.ClickOnLogin1();
		Thread.sleep(3000);
		
		objLogin.enterUserName(prop.getProperty("td_UserName"));
		logger.log(LogStatus.INFO, "Sucessfully Enetered Username");
		
		objLogin.enterPassword(prop.getProperty("td_Pwd"));
		logger.log(LogStatus.INFO, "Sucessfully Enetered Password");
		
		objLogin.ClickOnLogin2();
		logger.log(LogStatus.INFO, "Sucessfully Clicked On Login Button");
		Thread.sleep(3000);
		if(objLogin.VerifyDashBoardLink()==true) {
			logger.log(LogStatus.INFO,"User's Home Page is displayed");
			logger.log(LogStatus.INFO,"TestID01_A is Pass");
		}else
			logger.log(LogStatus.INFO,"TestCase is Failed");
			driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-1']")).click();
		
			driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	}
	
	@SuppressWarnings("static-access")
	@Test(priority=2)
	public void TestID01B() throws Exception {
		 logger = reports.startTest("TestID01B");
		objLogin=new LoginPage(driver);
	
		driver.get(prop.getProperty("td_URL"));
		driver.manage().window().maximize();
		
		objLogin.ClickOnLogin1();
		Thread.sleep(3000);
		
		objLogin.enterUserName(prop.getProperty("td_UserName"));
		logger.log(LogStatus.INFO, "Sucessfully Enetered Username");
		
		objLogin.enterPassword(prop.getProperty("td_WrongPwd"));
		logger.log(LogStatus.INFO, "Sucessfully Enetered Wrong Password");
		
		objLogin.ClickOnLogin2();;
		Thread.sleep(3000);
		if(oBroUtil.VerifyUserError(driver.findElement(By.xpath("//li[contains(text(),'Your email or password is incorrect')]")),"Your email or password is incorrect")==true) 
		{
			logger.log(LogStatus.INFO,"Sucessfully verified Error message is displayed");
			logger.log(LogStatus.INFO,"TestID01_B is Pass");
		}else
			logger.log(LogStatus.INFO,"TestCase is Failed");
	}
	
	@Test(priority=3)
	public void TestID01C() throws Exception {
		 logger = reports.startTest("TestID01C");
		objLogin=new LoginPage(driver);
	
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		
		objLogin.ClickOnLogin1();
		Thread.sleep(3000);
		
		objLogin.enterUserName(prop.getProperty("td_WrongUserName"));
		logger.log(LogStatus.INFO, "Sucessfully Enetered WrongUsername");
		
		objLogin.enterPassword(prop.getProperty("td_Pwd"));
		logger.log(LogStatus.INFO, "Sucessfully Enetered Password");
		
		objLogin.ClickOnLogin2();;
		if(oBroUtil.VerifyUserError(driver.findElement(By.xpath("//li[contains(text(),'Your email or password is incorrect')]")),"Your email or password is incorrect")==true) 
		{
			logger.log(LogStatus.INFO,"Sucessfully verified Error message is displayed");
			logger.log(LogStatus.INFO,"TestID01_C is Pass");
		}else
			logger.log(LogStatus.INFO,"TestCase is Failed");
	}
	
	@Test(priority=4)
	public void TestID01D() throws Exception {
		 logger = reports.startTest("TestID01D");
		objLogin=new LoginPage(driver);
	
		driver.get("https://www.xero.com/us/");
		driver.manage().window().maximize();
		
		objLogin.ClickOnLogin1();
		Thread.sleep(3000);
		
		objLogin.ClickOnForgotPassword();
		
		objLogin.enterEmail(prop.getProperty("td_UserName"));
		logger.log(LogStatus.INFO, "Sucessfully Enetered Username");
		
		Thread.sleep(3000);
		objLogin.ClickOnSendLink();
		
		Thread.sleep(3000);
		Assert.assertEquals(objLogin.VerifyCheckEmailLink(), true);
		logger.log(LogStatus.INFO,"Sucessfully passed Testcase");
	}
}
