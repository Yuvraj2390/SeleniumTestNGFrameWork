package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.homePageObjects;
import pageObjectModel.loginPageObjects;

import resources.baseClass;
import resources.commonMethods;
import resources.storeData;

public class verifyLogin extends baseClass{
	
	@Test 
	public void verifyLoginWithValidData() throws IOException, InterruptedException {
		
		
		homePageObjects hp = new homePageObjects(driver);
		hp.clickOnMyAccout().click();
		hp.clickOnLogin().click();
		loginPageObjects lp = new loginPageObjects(driver);
		lp.emailBox().sendKeys(emailAddress);
		lp.passwordBox().sendKeys("12345678");
		lp.loginButton().click();
		String actualURL = driver.getCurrentUrl();
		String ExpectedURL = storeData.loginExpectedURL;
		commonMethods.handleAssertion(actualURL, ExpectedURL);
		commonMethods.handleExpliciteTimeOut(10, hp.clickOnMyAccout(), driver);
		hp.clickOnMyAccout().click();
		commonMethods.handleExpliciteTimeOut(10, lp.logOutButton(), driver);
		lp.logOutButton().click();
		String actualText = lp.logOutConfirmationText().getText();
		String expectedText = storeData.logOutExpectedConfirmationtext;
		commonMethods.handleAssertion(actualText, expectedText);
		
	}
	
	
	
	@Test
	public void verifyLoginWithInValidData() throws IOException, InterruptedException {
		
		homePageObjects hp = new homePageObjects(driver);
		hp.clickOnMyAccout().click();
		hp.clickOnLogin().click();
		loginPageObjects lp = new loginPageObjects(driver);
		lp.emailBox().sendKeys(emailAddress);
		lp.passwordBox().sendKeys("123456789");
		lp.loginButton().click();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = storeData.loginExpectedURL;
		commonMethods.handleAssertion(actualURL, expectedURL);
		
	}

}
