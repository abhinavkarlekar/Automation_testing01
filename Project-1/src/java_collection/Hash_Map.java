package java_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

/* Hash map, Linked HashMap and TreeMap class implements map interface that allows to store values in form of key and value pair, 
   where key should be unique.
* If you try to insert a duplicate key, it will replace with the corresponding key.
* Hash map not maintain insertion order.
* HashMap used to download file in our desired location in Selenium.
* The default capacity of java hash map class is 16 with a load factor of 0.75.
* HashMap is not Synchronized and not thread safe.
* To use Map interface, you need to create an object for class. After that you can access methods present in class. 
  We can create list in integer format or string format.
   
 * Methods of Map implementing class. 
1. To add values in list- put( key, value); we can add values as integer and string type depending upon data type.
2. To print all values in Map- Print the reference variable of a HashMap.
3. To get value with respect to index- get(index); This method accept index of value.
4. To remove a particular value- remove(index); remove( value); You can pass index or value to remove value from the list.
5. To remove all values- clear();
6. To search any value and key which is present or not- ContainsKey(key);, ContainsValue(value); Return type of it is Boolean value.
7. To create duplicate copy of list- clone(); 

8. To get separate key and values using Iterator-
a. Convert Map into set - used entry set () method and store in one variable of set type.
b. Used iterator with help of set reference variable and store in one variable of iterator type.
c. Use while loop, take HashNext() method with help of iterator variable in parenthesis.
d. Inside loop, Use next () method with help of iterator variable and type cast into Map. Entry. because values are present in entry set() method.
e. Use get key() method and GetValue() method with help of Map. Entry variable.
 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// Add Values 
		hm.put(0, "ab");
		hm.put(1, "cd");
		hm.put(5, "ef");
		hm.put(6, "gh");
		hm.put(7, "ij");
		hm.put(0, "kl");
		
		// To Print values 
		System.out.println(hm);
		
		// To remove value
		// hm.remove (7);
		// hm.remove(5, "ef");
		// System.out.println(hm);
		
		// To Replace one value
		// hm.replace(1, "xy");
		// hm.replace(5, "ef", "st");
		// System.out.println(hm);
		
		// To get Value with respect to index 
		System.out.println(hm.get(6));
		
		// To get Size 
		System.out.println(hm.size());
		
		// To Search any key 
		System.out.println(hm.containsKey(7));
		
		// To Search any value 
		System.out.println(hm.containsValue("ab"));
		
		// Create duplicate copy 
		// System.out.println(hm.clone());
		
		// To remove all Values
		//hm.clear();
		// System.out.println(hm);
		
		// To Print all values using iterator
		// convert HashMap to set
		
		Set<Entry<Integer, String>> s = hm.entrySet();
		Iterator<Entry<Integer, String>> it = s.iterator();
		while (it.hasNext()) {
		}	
		Map. Entry m = (Map.Entry) it.next();
		System.out.println("Key is:- " + m.getKey());
		System.out.println("value is:- " + m.getValue());
	}

}
