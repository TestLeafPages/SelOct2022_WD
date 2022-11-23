package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{
	
    @Test
	public void runCreateLead() throws InterruptedException {
    	LoginPage lp = new LoginPage(driver);
    	lp.enterUsername("Demosalesmanager")
    	.enterPassword("crmsfa")
    	.clickLoginButton()
    	.clickCrmsfaLink()
    	.clickLeadsButton()
    	.clickCreateLeadButton()
    	.enterCompanyName("Testleaf")
    	.enterFirstName("Subraja")
    	.enterLastName("Subi")
    	.clickSubmitButton()
    	.verifyCreateLead();
	
	}

}
