package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Simple Alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();

		alert.accept();
		// Snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/alert.png");
		FileUtils.copyFile(source, dest);
		// Confirm Alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		//Prompt ALert
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		alert.sendKeys("Technology");
		alert.accept();
		String text2 = driver.findElement(By.xpath("//p[@id='result1']")).getText();
		System.out.println(text2);
		if (text2.contains("Technology")) {
			System.out.println("Text entered successfully");
		}
		else {
			System.out.println("Not entered");
		}
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		String text1 = alert.getText();
		System.out.println(text1);
		alert.accept();
		
		

	}

}
