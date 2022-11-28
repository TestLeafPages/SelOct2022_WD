package week4.day4.testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void testcase1() {
	  
	  System.out.println("Testcase-1 with @Test-5");
  }
  
  @Test
  
  public void testcase2() {
	System.out.println("Testcase-2");


}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method-4");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method-6");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass-3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass-7");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest-2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest-8");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite-1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite-9");
  }

}
