package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the parent frame
		driver.switchTo().frame(0);
		//switch to the nested frame
		driver.switchTo().frame("frame2");
		
		//click the button inside the frame
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
	}

}
