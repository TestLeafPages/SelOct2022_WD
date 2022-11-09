package week3.day3;

public class LearnStatic1 {
	
	public void add() {
		System.out.println("normal method");
	}
	
     public	static void sub() {
		System.out.println("static method");
	}
	
	static {
		System.out.println("I am a  static block");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		sub();
		//LearnStatic1 b = new LearnStatic1();
		//b.add();
	}

}
