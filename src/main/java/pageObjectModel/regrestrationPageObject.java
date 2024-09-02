package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class regrestrationPageObject {
	public WebDriver driver;
	
	private By firstName = By.xpath("//input[@id='input-firstname']");
	private By lastName = By.xpath("//input[@id='input-lastname']");
	private By email = By.xpath("//input[@type='email']");
	private By telePhone = By.xpath("//input[@name = 'telephone']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By confirmPassword = By.xpath(" //input[@placeholder='Password Confirm']");
	private By newsLetterYes = By.xpath("(//label[@class = 'radio-inline'])[1]");
	private By newsLetterNo = By.xpath("(//label[@class = 'radio-inline'])[2]");
	private By termsAndCondition = By.xpath("//input[@name = 'agree']");
	private By continueButton = By.xpath("//input[@type='submit']");
	private By firstNameErrorMessage = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By lastNameErrorMessage = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By emailErrorMessage = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By telePhoneErrorMessage = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By passwordErrorMessage = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	private By confirmPasswordErrorMessage = By.xpath("//div[text()='Password confirmation does not match password!']");
	private By termsAndConditionErrorMessage = By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");

	
	public regrestrationPageObject(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement firstNameBox () {
		return driver.findElement(firstName);
	}
	
	public WebElement lastNameBox() {
		return driver.findElement(lastName);
	}
	
	public WebElement emailBox() {
		return driver.findElement(email);
	}
	
	public WebElement telePhoneBox() {
		return driver.findElement(telePhone);
	}
	
	public WebElement passwordBox() {
		return driver.findElement(password);
	}
	
	public WebElement confirmPasswordBox() {
		return driver.findElement(confirmPassword);
	}
	
	public WebElement yesNewsLetterRadioBox() {
		return driver.findElement(newsLetterYes);
	}
	
	public WebElement noNewsLetterRadioBox() {
		return driver.findElement(newsLetterNo);
	}
	
	public WebElement termsAndConditionCheckBox() {
		return driver.findElement(termsAndCondition);		
	}
	
	public WebElement continueBtn() {
		return driver.findElement(continueButton);
	}
	
	public WebElement firstNameErrorMessage() {
		return driver.findElement(firstNameErrorMessage);
	}
	
	public WebElement lastNameErrorMessage() {
		return driver.findElement(lastNameErrorMessage);
	}
	
	public WebElement emailErrorMessage() {
		return driver.findElement(emailErrorMessage);
	}
	
	public WebElement telePhoneErrorMessage() {
		return driver.findElement(telePhoneErrorMessage);
	}
	
	public WebElement passwordErrorMessage() {
		return driver.findElement(passwordErrorMessage);
	}
	
	public WebElement confirmPasswordErrorMessage() {
		return driver.findElement(confirmPasswordErrorMessage);
	}
	
	public WebElement termsAndConditionErrorMessage() {
		return driver.findElement(termsAndConditionErrorMessage);
	}

}
