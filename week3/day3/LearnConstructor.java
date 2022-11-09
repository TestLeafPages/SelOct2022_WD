package week3.day3;

import org.testng.Assert;

public class LearnConstructor {
	
	int empId;
	String empName;
	boolean empStatus;
	String name="TestLeaf";
	
	LearnConstructor(){
		this(200, "S", true);
		System.out.println("default constructor");
		empId=100;
		empName="Subraja";
		empStatus=true;	
	}
	
	
	LearnConstructor(int empId,String empName,boolean empStatus){
		
		System.out.println("Parameterized constructor");
		
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		LearnConstructor obj = new LearnConstructor();
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.empStatus);
		
		

	}

}
