package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Go to Amazon website(https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		   2)Type Phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
//		   3)Print price of every phone
		List<WebElement> allPhoneElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> list = new ArrayList<Integer>();
		int size = allPhoneElements.size();
		for (int i = 0; i < size; i++) {
		    //System.out.println(allPhoneElements.get(i).getText());
		    String replace = allPhoneElements.get(i).getText().replace(",","");
		    //System.out.println(replace);
		    int parseInt = Integer.parseInt(replace);
		    //System.out.println("Converted value : "+parseInt);
		    list.add(parseInt);
		}
		Collections.sort(list);
		System.out.println(list);
		//print the size of list
		System.out.println("List size :"+list.size());
//		   4)Print the lowest price 
		System.out.println(list.get(0));
		//convert list to set to remove duplicates
	   Set<Integer> set = new TreeSet<Integer>(list);
	   System.out.println(set);
	   //print the size of set
	   System.out.println(set.size());
	   //verify
	   if (list.size()==set.size()) {
		System.out.println("No Duplicates");
	}
	   else {
		   System.out.println("Has Duplicates");
	   }
	   
		
		

	}

}
