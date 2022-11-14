package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev109273.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the frame using id 
		//driver.switchTo().frame("gsft_main");
		//switch to the frame using index
		//driver.switchTo().frame(0);
		//switch to the frame using WebElement
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.id("user_name")).sendKeys("admin");

	}

}
