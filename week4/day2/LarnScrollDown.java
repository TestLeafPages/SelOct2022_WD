package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LarnScrollDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions builder = new Actions(driver);
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		builder.click(mobiles).perform();

		WebElement ele = driver
				.findElement(By.xpath("//span[text()='© 1996-2022, Amazon.com, Inc. or its affiliates']"));

		builder.scrollToElement(ele).perform();
		//builder.clickAndHold(ele).moveToElement(ele).perform();

	}

}
