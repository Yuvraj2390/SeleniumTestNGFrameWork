package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class baseClass {
	
	public static WebDriver driver;
	public static String emailAddress = uniqueEmailAdderss();
	Properties prop = new Properties();
	public void launchBrowser() throws IOException {
		
		
		//Read file
		FileInputStream fis = new FileInputStream("C:\\Users\\CEMTREX\\eclipse-workspace\\SeleniumPageObjectModelMavenFrameWork\\src\\main\\java\\resources\\data.properties");
		//Access file
		prop = new Properties();
		//Loading the properties file
		prop.load(fis);
		//To access the value form the file
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("fireFox")) {
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}else {
			System.out.println("Please chose the browser first");
		}
		
	}
	
	public static String uniqueEmailAdderss() {
		return System.currentTimeMillis()+"@mailinator.com";
	}
	
	//To capture the screenshot
		public static String screenShot(WebDriver driver, String filename)  {
			String dateAndTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			// 202408311143

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateAndTime + ".png";
		    try {
				FileUtils.copyFile(source, new File(destination));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return destination;
		}

	
	@BeforeMethod
	public void launchBrowserAndUrl() throws IOException {
		launchBrowser();
		driver.get(prop.getProperty("url"));
	}

}
