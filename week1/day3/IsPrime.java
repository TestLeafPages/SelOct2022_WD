package week1.day3;

public class IsPrime {

	public static void main(String[] args) {
		/*
		 */
		
		int num=96;
		
	boolean flag=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("not prime num");
	flag=false;
	//break;
			}
		}
		if(flag) {
			System.out.println("its prime num");
		}
		
		

	}

}
