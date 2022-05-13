package Unit4Day12.Question2;

import java.util.*;

public class StateCapital {
	
	
	public static void main(String[] args) {
		
		 
		HashMap <String,String> ss = new HashMap<>();
		
		ss.put("Uttar Pradesh", "Lucknow");
		ss.put("Madhya Pradesh", "Bhopal");
		ss.put("Bihar", "Patna");
		ss.put("Mumbai", "Maharastha");
		ss.put("Andhyapradesh", "Hydrabad");
		
		
	   Set<Map.Entry<String, String>> s = ss.entrySet();
		
		for(Map.Entry<String, String> capital:s)
		{
			System.out.println(capital.getKey()+"---------"+capital.getValue());
			
		}
		
	}
	 
	

}


// Question. 
// create a LinkedHashMap object as :
// key:String (Indian-state)
// value: String (capital of that state)
// Add 5 Indian state and their capital into this map and print all the entries one by one from this map