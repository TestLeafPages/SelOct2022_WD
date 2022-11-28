package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintion {

	public ChromeDriver driver;
	@Given("Open the Chrome Browser")
	public void openchromebrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Given("load the application url")
	public void loadtheapplicationurl() {
		 driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}
	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on  Login button")
	public void clickloginbutton() {
		 driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		 boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		 Assert.assertTrue(displayed);
		 System.out.println("HomePage is displayed");
	}
	
	@But("Errormessage should be displayed")
	public void verifyErrorMessage() {
		boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("Error message is displayed");

	}



}
