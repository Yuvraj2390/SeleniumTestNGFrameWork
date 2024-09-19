package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {
	public WebDriver driver;
	
	
	private By myAccount = By.xpath("//a[@title='My Account']");
	private By register = By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text()='Login']");
	private By searchBox = By.xpath("//input[@name='search']");
	private By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
	
	
	public homePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickOnMyAccout() {
		return driver.findElement(myAccount);
	}
	
	public WebElement clickOnRegister() {
		
		return driver.findElement(register);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}
	
	public WebElement searchButton() {
		return driver.findElement(searchButton);
	}
	

}
