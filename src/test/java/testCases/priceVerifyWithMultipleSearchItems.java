package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.baseClass;

public class priceVerifyWithMultipleSearchItems extends baseClass{
	
		@Test()
		public void endToEndTestCase() throws InterruptedException{
		
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
			Thread.sleep(1000);
			String price = driver.findElement(By.xpath("//p[@class='price']")).getText();
			String[] priceWithText = price.split(" ");
			String onlyNumbersPrice =priceWithText[0].replaceAll("[^0-9//.]", "");
			System.out.println(onlyNumbersPrice);
			String iPhoneActualPriceString = "$" + onlyNumbersPrice;
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='search']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='search']")).sendKeys("samsung");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
			Thread.sleep(1000);
			
			
			String tabPrice = driver.findElement(By.xpath("//p[@class='price']")).getText();
			String[] TabPriceWithText = tabPrice.split(" ");
			String onlyNumbersPriceTab =TabPriceWithText[0].replaceAll("[^0-9//.]", "");
			System.out.println(onlyNumbersPriceTab);
			String TabActualPriceString = "$" + onlyNumbersPrice;
			double TabActualPriceDouble = 
			
			
			
		}

}
