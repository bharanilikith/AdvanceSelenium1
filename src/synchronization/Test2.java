package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		while(true) {
			try {
				driver.findElement(By.name("q")).sendKeys("hello");
				break;
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	//	driver.close();
	}

}
