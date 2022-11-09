package week3.day3;

public class Child extends Parent {
	
	public void land2() {
		super.land1();
		System.out.println("Child class");

	}
	
	public void land1() {
		super.land1();
		System.out.println("Overriden method in child class");

	}
	
public static void main(String[] args) {
	Child c = new Child();
	c.land2();
}
}
