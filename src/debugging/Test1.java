package debugging;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");

	}

}
