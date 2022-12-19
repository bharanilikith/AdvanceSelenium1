package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

public class Test0 {

	public static void main(String[] args) throws SQLException {

//Step:1 Register to the database
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		
//Step:2 Connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcse15","root","root");
		
//Step:3 Create sql query Statement
		Statement stat = con.createStatement();
		String query="select * from logindetails";
		
//Step:4 execute query
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		ResultSet res = stat.executeQuery(query);
		while(res.next()) {
			driver.findElement(By.id("username")).sendKeys(res.getString(1));
			driver.findElement(By.name("pwd")).sendKeys(res.getString(2));
					
			System.out.println(res.getString(1));
		    System.out.println(res.getString(2));
		}
	



//step:5 close the database
		con.close();
		
	}

}
