package week1.day2;

public class InputAgru {

	
	public void add(int a,int b,int d) {
		int c =a+b+d;
		System.out.println(c);
	}
		
	public void sub(int a,float b) {
		float c1 =  (a-b);
		System.out.println(c1);
	}
	public static void main(String[] args) {
		
		InputAgru obj= new InputAgru();
		obj.add(5, 6, 7);
		obj.sub(10, 5.6f);
		
	}
	

}
