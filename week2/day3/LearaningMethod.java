package week2.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearaningMethod {

	public static void main(String[] args) throws IOException {
		
       WebDriverManager.chromedriver().setup();
	//to lanuch chrome browser
		
		ChromeDriver driver=new ChromeDriver();	
		
		//syntax wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//returntype of get: void or nothing return
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Democsr2");
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		
		
		
		//snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File des=new File("./snap/name.png");
		
		FileUtils.copyFile(source, des);
		
driver.findElement(By.xpath("(//label[text()='Password']/following::input)[2]")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//snapshot
				File source1 = driver.getScreenshotAs(OutputType.FILE);
				
				File des1=new File("./snap/name.png");
				
				FileUtils.copyFile(source1, des1);
		
		driver.quit();
	}

}
