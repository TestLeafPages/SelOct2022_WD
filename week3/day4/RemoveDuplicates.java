package week3.day4;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
	   int[] nums = {2,4,6,7,2,9,4,1};//2,4
	   //Output->{2,4,6,7,9};
	   //Declare a set
	   Set<Integer> unique = new TreeSet<Integer>();
	   //add the elements in Set
	   //Iterate through a loop
	   for (int i = 0; i < nums.length; i++) {
		   unique.add(nums[i]);//nums[0]=2,nums[1]=4
	}
	   
	   System.out.println(unique);
	   

	}

}
