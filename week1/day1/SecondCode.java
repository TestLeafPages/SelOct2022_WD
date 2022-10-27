package week1.day1;

public class SecondCode {
	
	//Accessmodifier Returntype  name()
	
	public void phoneNum() {
		//System.out.println("hi to all");
	}
		public int getPhoneNum() {
			return 123567;
		//return 1234989;
			
		}
	public void getPhoneColor() {
		System.out.println("red");
		
	}
	
	
	public static void main(String[] args) {
// how to create  object 
		// syntax: classname objectname= new classname();
		
	//create an object
		SecondCode obj=new SecondCode();
		
		//call the method using the object
		
		obj.phoneNum();
		//ctrl+2 -->l
		 obj.getPhoneColor();
		
		
		 int phoneNum = obj.getPhoneNum();
		 System.out.println(phoneNum);
	
		
		Code obj1=new Code();
		obj1.color();
		
		
		
	}
}
