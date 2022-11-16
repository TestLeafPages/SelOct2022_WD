package week4.day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacters {

	public static void main(String[] args) {
		String str = "amazon india";
		//a-3,m-1,z-1,o-1,i-2,n-2,d-1, -1//Character Integer
		//least occuring character-m,z,o,d, 
		//convert string toCharArray
		char[] charArray = str.toCharArray();
		//declare Map
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		//Method1
		//Iterate and all the values inside the map
//		for (int i = 0; i < charArray.length; i++) {
//		    char key=charArray[i];
//			if(map.containsKey(key)) {
//				Integer value = map.get(key);
//				map.put(key, value+1);
//			}else {
//			       //key        value
//			map.put(key, 1);
//			}
//		}
//		System.out.println(map);
		//Method2
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
		}
		System.out.println(map);//a-3,m-1,z-1,o-1,i-2,n-2,d-1, -1
		//least occuring character
		for (Entry<Character, Integer> eachentry : map.entrySet()) {
			if (eachentry.getValue()==1) {
				System.out.println(eachentry.getKey()+"->"+eachentry.getValue());
			}
			
		}
		
		//maximum Occurence
		int maxOccurence = 0;
		char max=0;
		
		for (Entry<Character, Integer> eachEntry : map.entrySet()) {
			if (eachEntry.getValue()>maxOccurence) {
				max=eachEntry.getKey();
				maxOccurence=eachEntry.getValue();
			}
		}
		System.out.println("Maximum occuring character is "+max+"  -- "+maxOccurence);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
