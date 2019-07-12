package Cucumber.CaseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
   static WebDriver driver;
   public static WebDriver getDriver(String browser,String url) 
   {
	  if(browser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	
	  }
	  driver.manage().window().maximize();
		 driver.get(url);
	return driver;
   }
   
}
