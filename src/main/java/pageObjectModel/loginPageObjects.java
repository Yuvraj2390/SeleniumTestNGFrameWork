package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	WebDriver driver;

	private By email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By login = By.xpath("//input[@value='Login']");
	private By logOut = By.xpath("(//a[text()='Logout'])[1]");
	private By logOutConfirmationText = By.xpath("//h1[text()='Account Logout']");

	public loginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement emailBox() {
		return driver.findElement(email);
	}

	public WebElement passwordBox() {
		return driver.findElement(password);
	}

	public WebElement loginButton() {
		return driver.findElement(login);
	}

	public WebElement logOutButton() {
		return driver.findElement(logOut);
	}

	public WebElement logOutConfirmationText() {
		return driver.findElement(logOutConfirmationText);
	}
}
