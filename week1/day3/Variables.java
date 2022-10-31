package week1.day3;

public class Variables {

	//Global/Instance variable:

	int num1=23;
	String str="TestLeaf";
	
	
	public void number() {
		//local variable
		int num1=65;
		System.out.println(num1);
		System.out.println(num1);
	}
	
	public void phone() {
		int  age=24;
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables obj=new Variables();
		obj.number();
		obj.phone();
		System.out.println(obj.num1);
	}

}
