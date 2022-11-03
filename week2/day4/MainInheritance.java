package week2.day4;

public class MainInheritance {

	public static void main(String[] args) {
		
		FatherInheritance father= new FatherInheritance();
	father.myOwnHouse();
		father.land();	
		father.oldLand();
		father.layflooring();
		System.out.println("---------------------------------------");
		
		ChildInheritance child= new ChildInheritance();
		child.oldLand();
		System.out.println("------form gp");
		child.myOwnHouse();
		child.land();
		child.layflooring();
		System.out.println("------form p");
		child.ownHouse();
		
	
		

	}

}
