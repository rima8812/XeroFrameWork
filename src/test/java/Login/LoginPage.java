package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='Username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement Password;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement button_login1;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement button_Forgot_Password;
	
	@FindBy(xpath="//button[@value='login']")
	WebElement button_login2;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement button_logout;
	
	@FindBy(xpath="//a[contains(text(),'Send link')]")
	WebElement button_SendLink;
	
	@FindBy(xpath="//abbr[@class='xrh-avatar xrh-avatar-color-1']")
	WebElement ProfileLink;
	
	@FindBy(xpath="//a[@name='navigation-menu/dashboard']")
	WebElement DashBoardLink;
	
	@FindBy(xpath="//h2[contains(text(),'Please check your email')]")
	WebElement CheckEmailLink;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	public void enterUserName(String arg1) {
		UserName.sendKeys(arg1);
		}
	
	public void enterPassword(String arg1) {
		Password.sendKeys(arg1);
		}
	public void enterEmail(String arg1) {
		Email.sendKeys(arg1);
		}
	public void ClickOnLogin1() {
		button_login1.click();
		}
	public void ClickOnLogin2() {
		button_login2.click();
		}
	public void ClickOnLogout() {
		button_logout.click();;
		}
	public void ClickOnForgotPassword() {
		button_Forgot_Password.click();;
		}
	public void ClickOnSendLink() {
		button_SendLink.click();;
		}
	public void ClickOnDashBoardLink() {
		DashBoardLink.click();;
		}
	public boolean VerifyDashBoardLink() {
		return DashBoardLink.isDisplayed();
		}
	public boolean VerifyCheckEmailLink() {
		return CheckEmailLink.isDisplayed();
		}
}
