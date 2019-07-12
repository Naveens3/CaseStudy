package Cucumber.CaseStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchEngine {
	WebDriver driver;
	@Given("^Login the application$")
	public void login_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = UtilityClass.getDriver("chrome","http://10.232.237.143:443/TestMeApp/login.htm");
		 driver.findElement(By.name("userName")).sendKeys("Shopik");                       //Enter UserName
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");   //Enter Password
		  driver.findElement(By.name("Login")).click();                                     //Click Login
		  Assert.assertEquals(driver.getTitle(), "Home");  
	}

	@When("^Search the product$")
	public void search_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//input[@id='myInput' and type='text']")).click();
		//Actions act= new Actions(driver);
		//driver.findElement(By.name("products")).click();
		//act.moveToElement(driver.findElement(By.name("products"))).build().perform();
		
		driver.findElement(By.name("products")).sendKeys("head");
			
		//driver.findElement(By.xpath("//*[@id=\'myInputautocomplete-list\']/div")).click();
		//Select sel = new Select(driver.findElement(By.id("myInputautocomplete-list")));
		//sel.selectByVisibleText("Headphone");
		
		//driver.findElement(By.xpath("//input[@type='hidden' and value='Headphone']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @value='FIND DETAILS']")).click();
		

	}

	@Then("^Add to product$")
	public void add_to_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}
}
