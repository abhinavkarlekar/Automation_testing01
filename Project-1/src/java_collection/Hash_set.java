package java_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash_set {
	
/* Java hash Set, linked HashSet and treeSet class implements set interface, so we can use all methods present in list interface.
 * Java hash set class is used to create a collection that uses a hash table.
 * Hash set contains unique values.
 * Hash set allows null value.
 * Hash set class is non synchronized and it is not thread safe.
 * It doesn't accept duplicate value.
 
 * Not Synchronized- Suppose there are five threads (five different programs) accessing set interface at once, there is change to loss data 
   efficiency. So, it is not thread-safe.
 * Thread-safe- If one program accessing one class then other program needs to wait till first program release that class.
 
 * To use set interface, you need to create an object for HashSet class. After that you can access methods present in HashSet class. 
   You can create list in integer format or string format.
   
 * Methods of HashSet class. 
1.To add values in list- add(value); You can add values as integer and string type depending upon data type. 
We can add values with help of for loop. Inside the loop, used add () method and pass loop variable inside the method.
2. To print all values in list- Print the reference variable of HashSet.

3. To print all value using iterator interface-
a. Used iterator () method and store method in one variable of iterator type.
b. Used while loop, take HashNext() method inside parenthesis. Method will return true because set contain more than one element.
c. To print one by one value- Used next() method in PrintLn statement.

4. To remove a particular value- remove(index); remove(value); You can pass index or value to remove value from the list.
5. To remove all values- clear();
6. To search any value that is present or not- contains(value); Return type of it is Boolean value.
7. To create duplicate copy of list - clone(); 

 */
	public static void main(String[] args) {
	
		TreeSet<Integer> ts = new TreeSet<Integer>(); 
		HashSet<String> hs = new HashSet<String>(); 
		LinkedHashSet<Float> ls = new LinkedHashSet<Float>();
		
		// To add values. 
		ts.add(10); ts.add(20);ts.add(30);ts.add(40); 
		ts.add(50);ts.add(60);ts.add(70);ts.add(80);
		
		//To Print All Values
		System.out.println(ts);
		
		// To Remove
		//ts.remove (70); 
		//System.out.println(ts);
		
		//To Remove all values
		//ts.clear(); 
		//System.out.println(ts);
		
		// To Check specific value 
		//System.out.println(ts.contains(30));
		
		//Create Duplicate copy 
		//System.out.println(ts.clone());
		
		// To Print values using iterator 
		Iterator<Integer> it = ts.iterator(); 
		while(it.hasNext()) { 
		System.out.println(it.next());
		}

	}

}
