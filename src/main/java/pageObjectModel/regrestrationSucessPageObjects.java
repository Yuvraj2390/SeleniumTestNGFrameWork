package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class regrestrationSucessPageObjects {
	WebDriver driver;
	
	private By accountCreateText = By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	
	public WebElement confirmationText() {
		
		return driver.findElement(accountCreateText);
	}

}
