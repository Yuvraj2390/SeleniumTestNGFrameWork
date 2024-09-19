package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {

	WebDriver driver;
	
	private By cartIcon = By.xpath("//div[@id = 'cart']/button");
	private By cartToatlPrice = By.xpath("(//table[@class = 'table table-bordered']//td[@class= 'text-right'])[8]");
	
	public cartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement cartIcon() {
		return driver.findElement(cartIcon);
	}
	
	public WebElement cartTotalPrice () {
		return driver.findElement(cartToatlPrice);
	}
	
}
