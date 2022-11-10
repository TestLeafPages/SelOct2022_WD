package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		              
		String str = "TestLeaf";//e
		//Convert string to charArray //0 1 2 3 4 5 6 7
		char[] ch = str.toCharArray();//T,e,s,t,L,e,a,f
		//declare a set
		Set<Character> set = new LinkedHashSet<Character>();
		//Iterate through a for loop
		for (Character each : ch) {
			set.add(each);
		}
		
		
	}

}
