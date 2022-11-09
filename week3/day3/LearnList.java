package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//declare an array
		List<String> learners = new ArrayList<String>();
		
		learners.add("Varun");
		learners.add("Ramya");
		learners.add("Amsa");
		learners.add("Raj");
		learners.add("Anju");
	Collections.sort(learners);
		//find the size
		int count = learners.size();
		System.out.println(count);
		//print the list
		System.out.println(learners);
		
		learners.remove("Ramya");
		System.out.println(learners);
		
		learners.add("Ranjith");
		System.out.println(learners);
		
		learners.add(1, "Sachin");
		System.out.println(learners);
		
		
		
		

	}

}
