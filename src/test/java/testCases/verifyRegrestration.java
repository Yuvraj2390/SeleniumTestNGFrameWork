package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.homePageObjects;
import pageObjectModel.regrestrationPageObject;

import resources.baseClass;
import resources.commonMethods;
import resources.storeData;

public class verifyRegrestration extends baseClass {

	@Test
	public void verifyRegistrationWithValidData() throws IOException {

		
		homePageObjects hp = new homePageObjects(driver);
		hp.clickOnMyAccout().click();
		hp.clickOnRegister().click();
		regrestrationPageObject reg = new regrestrationPageObject(driver);
		reg.firstNameBox().sendKeys("Rahul");
		reg.lastNameBox().sendKeys("Kaushal");
		reg.emailBox().sendKeys(emailAddress);
		reg.telePhoneBox().sendKeys("1234567890");
		reg.passwordBox().sendKeys("12345678");
		reg.confirmPasswordBox().sendKeys("12345678");
		reg.yesNewsLetterRadioBox().click();
		reg.termsAndConditionCheckBox().click();
		reg.continueBtn().click();
		String actualURL = driver.getCurrentUrl();
		String expectedlURL = storeData.registerExpectedsucessURL;
		commonMethods.handleAssertion(actualURL, expectedlURL);

	}

	@Test

	public void verifyCompulsaryFieldsOnRegrestrationPage() throws IOException, InterruptedException {

		
		homePageObjects hp = new homePageObjects(driver);
		hp.clickOnMyAccout().click();
		hp.clickOnRegister().click();
		regrestrationPageObject reg = new regrestrationPageObject(driver);
		commonMethods.handleExpliciteTimeOut(10, reg.continueBtn(), driver);
		reg.continueBtn().click();
		String firstNameErrorActualresult = reg.firstNameErrorMessage().getText();
		String firstNameErrorExpectedresult = storeData.firstNameErrorExpectedresult;
		String lastNameErrorActualresult = reg.lastNameErrorMessage().getText();
		String lastNameErrorExpectedresult = storeData.lastNameErrorExpectedresult;
		String emailErrorActualresult = reg.emailErrorMessage().getText();
		String emailErrorExpectedresult = storeData.emailErrorExpectedresult;
		String telePhoneErrorActualresult = reg.telePhoneErrorMessage().getText();
		String telePhoneErrorExpectedresult = storeData.telePhoneErrorExpectedresult;
		String passwordErrorActualresult = reg.passwordErrorMessage().getText();
		String passwordErrorExpectedresult = storeData.passwordErrorExpectedresult;
		String privacyPolicyErrorActualresult = reg.termsAndConditionErrorMessage().getText();
		String privacyPolicyErrorExpectedresult = storeData.privacyPolicyErrorExpectedresult;

		commonMethods.handleAssertion(firstNameErrorActualresult, firstNameErrorExpectedresult);
		commonMethods.handleAssertion(lastNameErrorActualresult, lastNameErrorExpectedresult);
		commonMethods.handleAssertion(emailErrorActualresult, emailErrorExpectedresult);
		commonMethods.handleAssertion(telePhoneErrorActualresult, telePhoneErrorExpectedresult);
		commonMethods.handleAssertion(passwordErrorActualresult, passwordErrorExpectedresult);
		commonMethods.handleAssertion(privacyPolicyErrorActualresult, privacyPolicyErrorExpectedresult);

	}

	@Test
	public void verifyRegistrationWithPasswordMissMatch() throws IOException {
	
		homePageObjects hp = new homePageObjects(driver);
		hp.clickOnMyAccout().click();
		hp.clickOnRegister().click();
		regrestrationPageObject reg = new regrestrationPageObject(driver);
		reg.firstNameBox().sendKeys("Test");
		reg.lastNameBox().sendKeys("test123");
		reg.emailBox().sendKeys(emailAddress);
		reg.telePhoneBox().sendKeys("1234567890");
		reg.passwordBox().sendKeys("12345678");
		reg.confirmPasswordBox().sendKeys("123456789");
		reg.yesNewsLetterRadioBox().click();
		reg.termsAndConditionCheckBox().click();
		reg.continueBtn().click();
		String actualURL = driver.getCurrentUrl();
		String expectedlURL = storeData.registerExpectedsucessURL;
		commonMethods.handleAssertion(actualURL, expectedlURL);

	}

}
