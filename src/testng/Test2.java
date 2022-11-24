package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	public WebDriver driver;
	
	@Parameters({"browserName"})
	@Test
	public void tc1(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
	}
	

}
