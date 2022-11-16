package week4.day3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		
		//employee Details-empId,empName
		     // key  value
		map.put(121, "Asma");
		map.put(128, "Ranjith");
		map.put(125, "Varun");
		map.put(123,"Raji");
		map.put(129, "Anju");
		//print map
		System.out.println(map);
		System.out.println("=============");
		//get the value based on a key
		String value = map.get(125);
		System.out.println(value);
		System.out.println("===================");
		//get the keys alone as a set
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("===================");
		
		//Method2
		for (Integer each : keySet) {//dataType variable : data
			System.out.println(each +"->"+map.get(each));
		}
		System.out.println("===================");
		
		//to get the entry set
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
		
		
		
		

		
		
	}

}
