package week3.day4;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		             
	   int[] nums = {2,4,6,7,2,9,4,1};//2,4
	   
	   // 0 1 2 3 4 5
	   //{1,2,4,6,7,9}
	   //Output->{2,4,6,7,9};
	   //Declare a set
	   Set<Integer> set = new TreeSet<Integer>();
	   //add the elements in Set
	   //Iterate through a loop
	   for (int i = 0; i < nums.length; i++) {
		   
		   boolean add = set.add(nums[i]); //nums[0]=2,nums[1]=4
		 
		   if (!add) {
			System.out.println(nums[i]);
		}
		  
	}
	   
	 //  System.out.println(unique);
	   

	}

}
