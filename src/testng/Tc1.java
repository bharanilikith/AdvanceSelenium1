package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc1 {
public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void tc1() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		String title = driver.getTitle();
		
		//syntax
		//Assert.assertEquals(actual,Expected);
		
		//example
		Assert.assertEquals(title,"435ersrestredf");
		
		
		//Syntax
//		SoftAssert a=new SoftAssert();
//		a.assertEquals(actual, Expected);
		
		
		//example
		SoftAssert a=new SoftAssert();
		a.assertEquals(title,"6e7uytyhgajgu");
		
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		a.assertAll();
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
