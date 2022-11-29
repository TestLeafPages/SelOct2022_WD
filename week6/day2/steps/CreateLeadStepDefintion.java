package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadStepDefintion extends BaseClass {

	@Given("Click CRMSFA link")
	public void clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And("Click Leads Tab")
	public void clickLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("Click Create Lead Link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Enter the company name as (.*)$")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

	@And("Enter the first name as (.*)$")
	public void enterFirstName(String firstname) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}

	@And("Enter the last name as (.*)$")
	public void enterLastName(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}

	@And("Click on Create Lead Button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}

	@And("Verify ViewLeads Page")
	public void verifyViewLeadsPage() {
		System.out.println("Verified CreateLead successfully");
	}

}
