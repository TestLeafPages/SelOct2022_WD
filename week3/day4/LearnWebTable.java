package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table//th"));
		System.out.println("No: of columns in the table :"+columns.size());
		System.out.println("Header details: ");
		for (WebElement each : columns) {
			String text = each.getText();
			System.out.println(text);
		}
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println("No: of rows in the table :"+rows.size());
		System.out.println("row details: ");
		for (WebElement row : rows) {
			String text = row.getText();
			System.out.println(text);
	
		}
//To print the entire data  in the table
		System.out.println("*********************");
		
		for (int i = 2; i <=rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table//tr["+i+"]//td"));
			for (int j = 1; j <=cols.size(); j++) {
				String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(text);
			}
		
		}
		
		

	}

}
