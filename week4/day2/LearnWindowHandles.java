package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01rqfsvxn9djtblglpftgoa0it419778.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//how can I get a window handle
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window handle : " +parentWindow);
		//click the open button 
		String parentWindowTitle = driver.getTitle();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//To get the multiple window handles
		Set<String> windowHandles = driver.getWindowHandles();
		//To get the index convert set to a list
		List<String> list = new ArrayList<String>(windowHandles);
		//to find the size
		System.out.println("Number of opened windows : "+list.size());
		//switch the control to a new window
		driver.switchTo().window(list.get(1));
		//verify 
		String newWindowtitle = driver.getTitle();
		System.out.println("New window title : "+newWindowtitle);
		if (!parentWindowTitle.equals(newWindowtitle)) {
			System.out.println("Control switched to the new window");
		}
		else {
			System.out.println("Control stays in the same page");
		}
		//driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		//driver.close();
		
		//Open Multiple windows
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> closeWindows = driver.getWindowHandles();
		
		List<String> handles = new ArrayList<String>(closeWindows);
		System.out.println(handles.size());
		//To close all the windows except parent window
		for (String eachWindow : handles) {
			if (!eachWindow.equals(parentWindow)) {
				driver.switchTo().window(eachWindow);
				driver.close();
			}
		}
		
		
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
	
		
	}

}
