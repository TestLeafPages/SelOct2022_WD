package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
	
		
		//to lanuch chrome browser
		
		ChromeDriver driver=new ChromeDriver();	
		
		//syntax wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//returntype of get: void or nothing return
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		//attrbased path
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr2");
		

		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		//partial attrbasedxpath
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		
		//partial txtbased xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//collection /index xpth
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("TestLeaf");
		
		String Name="Dilip";
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(Name);
		
		
		driver.findElement(By.xpath("//input[contains(@id,'_lastName')]")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Thread.sleep(3000);
		
		String firstname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		System.out.println(firstname);
		
		if(Name.equals(firstname)) {
			System.out.println("lead is created");
		}else {
			System.out.println("lead is not created");
		}
	}

}
