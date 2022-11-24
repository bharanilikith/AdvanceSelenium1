package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test(groups="customer")
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
	
	@Test(groups="project")
	public void createProject() {
		Reporter.log("createProject",true);
	}
	
	@Test
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
	
	

}
