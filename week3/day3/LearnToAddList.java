package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnToAddList {

	public static void main(String[] args) {
	
		String[] names = {"India","Japan","America"};
		
		///Declare an list
		List<String> list = new ArrayList<String>();
		
		for (String each : names) {//datatype variable:dataname
			list.add(each);
		}
		
		System.out.println(list);
		
	}

}
