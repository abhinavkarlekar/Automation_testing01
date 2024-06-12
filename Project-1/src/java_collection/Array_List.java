package java_collection;

import java.util.ArrayList;

public class Array_List {

/* The array list, LinkedList, vector and stack class implements a list interface, so we can use all methods present in list interface. 
 * Array list grows dynamically. The array list maintains insertion order. Java array list can contain duplicate elements. It accepts null values.
 * To use list interface, we need to create an object for ArrayList class. After that we can access methods present in ArrayList class. 
 * we can create list in integer format or string format. 
 * 
 * Methods of ArrayList Class- 
 * To add values in list- add(value); or add(index, value); we can add values as integer and string type depending upon data type.
 * To print all values in list- Print the reference variable of ArrayList.
 * To get value with respect to index- get(index); This method accept index of value.
 * To remove a particular value- remove(index); remove( value); You can pass index or value to remove value from the list.
 * To remove all values- clear();
 * To search any value that is present or not- contains(value); Return type of it is Boolean value.
 * To create duplicate copy of list- clone();
 * To get index with respect to value- IndexOf(value); Return type of this is String. 
 * 
 */
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();  // Here we create object of ArrayList class. 
		
		
		names.add("Ashvini ");  // Here we add values using ArrayList method .add 
		names.add("Ashwini ");
		names.add("Ashwini ");
		names.add("Vaibhav");
		names.add("Shruti");
		names.add("Aakansha");
		names.add("Abhinav"); 
		names.add("Vaishnavi");
		names.add("Rahul");
		names.add("Dyaneshwar");
		
		// Add values with index 
		names.add(7, "def"); 
		//System.out.println(names);
		
		// To Print All values 
		System.out.println(names);
		
		// Print value with respect index 
		//System.out.println(names.get(8));
		
		//Remove values
		//names.remove (7); 
		//System.out.println(names);
		
		// To remove all values 
		// names.clear();
		
		// To check specific values   // it returns boolean value true/false. 
		System.out.println(names.contains ("Abhinav"));
		
		// To get index
		System.out.println(names.indexOf("Abhinav"));
		
		//To get size
		System.out.println(names.size());
		
		// create copy
		System.out.println(names.clone());
		//System.out.println(names);
		
		

	}

}
