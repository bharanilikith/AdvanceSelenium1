package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

try {
driver.get("https://www.flipkart.com/");
System.out.println("Page is loaded");
	}
catch(Exception e) {
	System.out.println("Fail:Page is not loaded");
}

driver.close();
}}
