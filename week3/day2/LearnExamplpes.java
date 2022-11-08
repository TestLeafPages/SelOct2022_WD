package week3.day2;

import java.time.Duration;
import java.util.AbstractList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExamplpes {
	
	//Selenium example-Interface-WebDriver,SearchContext,WebElement
	//Abstract Class-By
	//Concrete Class-RemoteWebDriver
	
	
	//Java Exmaples->Interface->List,Set,Map,

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	}

}
