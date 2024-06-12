package java_wrapper_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Wrapper_class {

/* Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
 * A Wrapper class is a class whose object wraps or contains primitive data types. They convert primitive data types into objects.
 
 * Primitive Type      Wrapper Class
    byte                 Byte
    short                short
    int                  Integer
    long                 Long
    float                Float
    double               Double
    boolean              Boolean
    char                 Character
    
 */
	public static void main(String[] args) {
		
/* 1) Convert Primitive type to wrapper class.
 • Initialize one variable with any value.
 • Use Wrapper class and used value of() method. After that Send reference variable of a given variable and store in one variable of wrapper class type. 
   After you can use println() method.
 */
		int i = 4500;  // Here we initialize one variable with value. 
		
		Integer a = Integer.valueOf(i); // Here we use wrapper class .valueOf() method. 
		
		System.out.println(a); // Output- 4500
		
		
		float f = 3000.78f;  // Here we initialize one variable with value. 
		
		Float v = Float.valueOf(f);  // Here we use wrapper class .valueOf() method. 
		
		System.out.println(v); // Output-3000.78 
		
		
		
/* 2) Convert Wrapper class to Primitive type. 
• Create object for Wrapper class type and give any one value in the argument.
• Initialize one variable, now take reference variable of wrapper class used value() method with match to your data type and wrapper class type. 
  After you can print it.  
  
 */
		
		Double d = new Double(5000.345); // Here we create a object of wrapper class with argument value. 
		
		Double pmt_dbl = d.doubleValue();  // Here we use value() method of wrapper class with matching data type. 
		
		System.out.println(pmt_dbl); 
		
		// output-5000.345
		
		
		
/* Date class : Suppose we want print current date in java, we use date class. Date class import from java util.
   Create object for it, using its object reference variable take method toSting();. 
 */
		
		
		Date d1 = new Date();
		String current_date = d1.toString(); 
		System.out.println(current_date);
		
		
		
/* Example 2 : Suppose we want format like d/MM/yyyy hh:mm:ss then use simple date format class. Create object for it and send argument as format 
 * in double quote. Using its object, you can access method format() and this method accept argument as object of date class.
 */
		
		Date d11 = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sm.format(d11));
	}

}
