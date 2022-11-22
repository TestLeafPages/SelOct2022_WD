package week4.day4.testcase;

import org.testng.annotations.Test;

public class MultipleTests {

	@Test(priority=-1)
	public void run() {
        System.out.println("Run");
	}
	@Test(priority=0)
	public void walk() {
		System.out.println("Walk");
	}
	@Test(priority=1)
	public void sleep() {
		System.out.println("Sleep");
	}
	@Test(priority=2)
	public void eat() {
		System.out.println("Eat");
	}

}
