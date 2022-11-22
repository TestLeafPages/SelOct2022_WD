package week4.day4.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
@BeforeTest	
public void sendData() {
	ExcelFileName="CreateLead";

}

	@Test(dataProvider = "fetch") // (groups="Anju")//(enabled=false)
	public void createLead(String companyName, String firstName, String lastName, String phoneNumber) {
		driver.findElement(By.linkText("Leads1")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text);
		if (text.contains(text)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Not created");
		}

	}
}
