package week4.day4.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  ChromeDriver driver;
	public String ExcelFileName;
	
@Parameters({"URL","USERNAME","PASSWORD"})
@BeforeMethod
	public  void preCondition(String url,String user,String pass) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

@AfterMethod
   public void postCondition() {
      //driver.close();
}

@DataProvider(name = "fetch",indices=1)
public String[][] fetchData() throws IOException {

  return ReadData.readData(ExcelFileName);
}
}


