package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
	
	WebDriver driver;
	
	private By productPrice = By.xpath("//p[@class='price']"); 
	private By iPhoneAddToCart = By.xpath("//div[@class = 'button-group']//button[1]");
	private By samsungAddToCartButton = By.xpath("(//div[@class = 'button-group'])[2]//button[1]");

	
	
	public searchPage(WebDriver driver) {
		this.driver = driver;
	}



	public WebElement productPrice() {
		return driver.findElement(productPrice);
	}
	
	public WebElement iphoneAddToCartButton() {
		return driver.findElement(iPhoneAddToCart);
	}
	
	public WebElement samsungAddToCartButton() {
		return driver.findElement(samsungAddToCartButton);
	}
	
	
	
}
