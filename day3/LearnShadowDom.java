package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class LearnShadowDom {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev121461.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Testleaf@123");
		driver.findElement(By.id("sysverb_login")).click();
		//Call Shadow Class
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(20);
		dom.findElementByXPath("//div[text()='All']").click();
		
		//driver.executeScript("arguments[0].click();", ele);
		
	}

}
