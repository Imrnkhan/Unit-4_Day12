package Unit4Day12.Question1;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		
		TreeMap<Student,String> tm = new TreeMap<>(new SortMark());
		
		tm.put(new Student(10,"Ganesh",950),"Maharastra");
		tm.put(new Student(12,"Surya",850),"Tamilnadu");
		tm.put(new Student(15,"Venkat",920),"Telangana");
		tm.put(new Student(16,"Dinesh",910),"Haryana");
		tm.put(new Student(18,"Srinu",880),"Kerla");
		
		Set<Map.Entry<Student,String>> set= tm.entrySet();
		for(Map.Entry<Student,String> me: set) {
		System.out.println("State :" + me.getValue());
		Student student = me.getKey();
		System.out.println("----------------------------------");
		System.out.println("Roll :" + student.getRollNo());
		System.out.println("Name :" + student.getName());
		System.out.println("Marks :" + student.getMarks());
		System.out.println("----------------------------------");
		
		
	
		}
}
}


// Question. 

// Create a Student bean class with following fields: **

// roll
// name
// marks
// ** create a HashMap as **

// key : String (Indian-state name)
// value : Student (student object with the proper details)
// Sort this HashMap according to their value (according to the Student marks) and print the state name and the corresponding student details in sorted order.