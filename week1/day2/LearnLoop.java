package week1.day2;

public class LearnLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("1"); 
		 * System.out.println("2"); 
		 * System.out.println("3");
		 * System.out.println("4"); 
		 * System.out.println("5");
		 */
		
		//syntax
		//for(int i=1;i<=5;i++){     }
		
		
		/*
		 * for(int i=1;i<=60;i++) { System.out.println(i); }
		 */
		
		/*
		 * for(int i=1000;i>0;i--) { System.out.println(i); }
		 */
		
		int n=5;
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
			//fact =1*1=1;, fact=1*2=2,fact=2*3=6,fact=6*4=24,fact=24*5=120;
			
		}
		System.out.println(fact);
		
		
		
	}

}
