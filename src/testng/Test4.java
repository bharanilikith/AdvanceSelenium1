package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Test4 {
	
	@Test
	public void demo(XmlTest xml) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(xml.getParameter("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("username")).sendKeys(xml.getParameter("username"));
	driver.findElement(By.name("pwd")).sendKeys(xml.getParameter("password"));
	}

}
