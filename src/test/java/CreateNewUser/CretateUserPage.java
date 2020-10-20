package CreateNewUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CretateUserPage {
	WebDriver driver;
	public CretateUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='LastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='EmailAddress']")
	WebElement EmailAddress;
	
	@FindBy(xpath="//input[@name='PhoneNumber']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//select[@name='LocationCode']")
	WebElement LocationCode;
	
	@FindBy(xpath="//input[contains(@name,'TermsAccepted')]")
	WebElement TermAcepted;
	
	@FindBy(xpath="//a[contains(text(),'Free trial')]")
	WebElement FreeTrial;
	
	@FindBy(xpath="//span[@class='g-recaptcha-submit']")
	WebElement RecaptchaSubmit;
	
	@FindBy(xpath="//h2[contains(text(),'Xero partner program signup form')]")
	WebElement SignupForm;
	
	@FindBy(xpath="//a[contains(text(),'accountant or bookkeeper')]")
	WebElement AccountBookkeeper;
	
	@FindBy(xpath="//a[contains(text(),'privacy')]")
	WebElement privacy;
	
	@FindBy(xpath="//a[contains(text(),'offer details')]")
	WebElement offerdetails;
	
	public void enterFirstName(String arg1) {
		FirstName.sendKeys(arg1);
		}
	
	public void enterLastName(String arg1) {
		FirstName.sendKeys(arg1);
		}
	public void enterEmailAddress(String arg1) {
		EmailAddress.sendKeys(arg1);
		}
	public void enterPhoneNumber(String arg1) {
		PhoneNumber.sendKeys(arg1);
		}
	public void selectLocationCode(String arg1) {
		Select sLocation=new Select(LocationCode);
		sLocation.selectByVisibleText(arg1);
		}
	public void enterClickOnTermAcepted() {
		TermAcepted.click();
		}
	public void ClickOnRecaptchaSubmit() {
		RecaptchaSubmit.click();
		}
	public void ClickOnSignupForm() {
		SignupForm.click();;
		}
	public void ClickOnAccountBookkeeper() {
		AccountBookkeeper.click();;
		}
	public void ClickOnFreeTrial() {
		FreeTrial.click();;
		}
	public void ClickOnprivacy() {
		privacy.click();;
		}
	public void ClickOnofferdetails() {
		offerdetails.click();;
		}
}
