package week1.day3;

public class LearningString {

	public static void main(String[] args) {
	
		/*
		 * Methods:
		 *  length()--to find how many characters --int 
		 * toCharArray()-- covert string to character array--char[]
		 *  equals("")-- to compare String content--boolean
		 *  equalIgnoreCase()--it will not compare lowercase or uppercase
		 *  contins()-- compare the string with matching content-- boolean
		 * indexOf()-- will return the index position of the given character---int
		 * CharAt()--character available in the given position---character
		 */
		
		
		//string literal 80
		String companyName="Test Leaf";
        //90
		
		//String object
		String company= new String("Test Leaf");//98
		
		String company1=new String("Test Leaf");//109
		
		//length--->method
		
		int length = company.length();
		System.out.println(length);
		
		//toCharArray()----->T,e,s,t, ,L,e,a,f
		
		//converting string into array
		char[] chars=companyName.toCharArray();
		//System.out.println(chars);
		
		for(int i=0;i<chars.length;i++) {
			System.out.println(chars[i]);
		}
		
		//equals-->method
		
		boolean equals = companyName.equals(company);
		System.out.println(equals);
		
		
		//==string Literal
		
		if(companyName==companyName) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//String object
		if(company==company1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//equalIgnoreCase()
		
		boolean equalsIgnoreCase = companyName.equalsIgnoreCase(company);
		
		System.out.println(equalsIgnoreCase);
		
		
		//contins()
		
		boolean contains = companyName.contains(" ");
		System.out.println(contains);
		
		//indexOf()
		
		int indexOf = companyName.indexOf('x');
		System.out.println(indexOf);
		//-1
		
		
		//CharAt()
		
		char charAt = companyName.charAt(2);
		System.out.println(charAt);
	}

}
