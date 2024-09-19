package testCases;


import org.testng.annotations.Test;

import pageObjectModel.cartPage;
import pageObjectModel.homePageObjects;
import pageObjectModel.searchPage;
import resources.baseClass;
import resources.commonMethods;

public class priceVerifyWithMultipleSearchItems extends baseClass{
	
		@Test()
		public void endToEndTestCase() throws InterruptedException{
			
			homePageObjects hp = new homePageObjects(driver);
			hp.searchBox().sendKeys("iphone");
			Thread.sleep(1000);
			hp.searchButton().click();
			
			
			searchPage sp = new searchPage(driver);
			String price = sp.productPrice().getText();
			
			String[] priceWithText = price.split(" ");
			String onlyNumbersPrice =priceWithText[0].replaceAll("[^0-9//.]", "");
			
			sp.iphoneAddToCartButton().click();
			double iPhoneActualPriceDouble = Double.parseDouble(onlyNumbersPrice);
			System.out.println(iPhoneActualPriceDouble);
			
			Thread.sleep(1000);
			hp.searchBox().clear();
			
			Thread.sleep(1000);
			hp.searchBox().sendKeys("samsung");
			Thread.sleep(1000);
			hp.searchButton().click();
			Thread.sleep(1000);
			String tabPrice = sp.productPrice().getText();
					
			String[] TabPriceWithText = tabPrice.split(" ");
			String onlyNumbersPriceTab =TabPriceWithText[0].replaceAll("[^0-9//.]", "");
			sp.samsungAddToCartButton().click();
			double TabActualPriceDouble = Double.parseDouble(onlyNumbersPriceTab);
			System.out.println(TabActualPriceDouble);
			
			double totalConstOfProducsDouble = iPhoneActualPriceDouble + TabActualPriceDouble;
			
			String totalCostOfTheProductsWithoutDoller = Double.toString(totalConstOfProducsDouble);
			System.out.println(totalCostOfTheProductsWithoutDoller);
			String totalCostOfTheProducts = "$" + totalCostOfTheProductsWithoutDoller;
			System.out.println(totalCostOfTheProducts);
			Thread.sleep(3000);
			cartPage cp = new cartPage(driver);
			cp.cartIcon().click();
			String priceInCart = cp.cartTotalPrice().getText();
			System.out.println(priceInCart);
			
			commonMethods.handleAssertion(priceInCart, totalCostOfTheProducts);
			
		}

}
