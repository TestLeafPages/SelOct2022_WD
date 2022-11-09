package week3.day3;

import org.testng.Assert;

public class LearnStatic {
	
	int empId;
	String empName;
	static String companyName;
	
	
	public void setValues(int id,String name,String company) {
		empId=id;
		empName=name;
		companyName=company;
	}
	
	public void printValues() {
		System.out.println(empId+" "+empName+" "+companyName);

	}
	

	public static void main(String[] args) {
		LearnStatic obj = new LearnStatic();
		obj.setValues(100,"Subraja", "TestLeaf");
		obj.printValues();
		System.out.println("---------------------");
		LearnStatic obj2 = new LearnStatic();
		obj2.setValues(200, "Subi", "Qeagle");
		obj.printValues();
		obj2.printValues();
		Assert.assertEquals(false, false);
		

	}

}
