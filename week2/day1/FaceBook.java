package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
	
		
		//to lanuch chrome browser
		
		ChromeDriver driver=new ChromeDriver();	
		
		//syntax wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//returntype of get: void or nothing return
		driver.get("https://www.facebook.com/");
		
		//how to max screen
		
		driver.manage().window().maximize();

		driver.findElement(By.partialLinkText("New")).click();
		
		//select class
		//return for findelement is webelement
		 WebElement select1 = driver.findElement(By.id("day"));
		Select obj= new Select(select1);
		obj.selectByValue("11");
		
		
		WebElement select2 = driver.findElement(By.id("month"));
		Select obj1= new Select(select2);
		obj1.selectByVisibleText("Sep");
		

		WebElement select3 = driver.findElement(By.id("year"));
		Select obj2= new Select(select3);
		obj2.selectByIndex(1);
		
	}

}
