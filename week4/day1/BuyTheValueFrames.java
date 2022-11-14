package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyTheValueFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@title='chat widget']"));
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//div[@class='initial-message-bubble']/button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Hamdard Hing')]")).click();

	}

}
