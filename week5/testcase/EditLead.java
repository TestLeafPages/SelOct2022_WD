package week4.day4.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {

	@BeforeTest	
	public void sendData() {
		ExcelFileName="EditLead";

	}

	// packagename.classname.methodname
	@Test(dataProvider="fetch")//(dependsOnMethods = "week4.day4.testcase.CreateLead.createLead", alwaysRun = true)

	public void editLead(String ph,String cn) throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement update = driver.findElement(By.id("updateLeadForm_companyName"));
		update.clear();
		update.sendKeys(cn);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text);
		if (text.contains(cn)) {
			System.out.println("Lead editted  successfully");
		} else {
			System.out.println("Not editted");
		}

	}
}
