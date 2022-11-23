package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	
	
	@Test
	public void runLogin() throws InterruptedException {
		System.out.println(driver);
		LoginPage lp = new LoginPage(driver);
        lp.enterUsername("Demosalesmanager")
        .enterPassword("crmsfa")
        .clickLoginButton()
        .verifyHomePage();
        
        
		
	}

}
