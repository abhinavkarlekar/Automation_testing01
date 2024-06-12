package java_string_class;

import java.util.Arrays;

public class StringBuffer_StringBuilder {

/* in java there are StringBuffer and StringBuilder classes it is also use to store string value in a string variable. 
 * while storing values using StringBuffer and StringBuilder we have to use new keyword. 
 * StringBuffer a=new StringBuffer("welcome");. 
 * StringBuilder b=new StringBuilder("Welcome");
 * Any method that can change original value it is mutable.
 * Any method that cannot change its original value it is immutable.
 * in java String is immutable.    
 * StringBuffer and stringBuilder are mutable. 
 * 
 */
	public static void main(String[] args) {
		
// Mutable : We are able to change the original value. 
		
 int a[]= {20,10,40,50,30};  // here we take array string and store some random data. 
 
 System.out.println(Arrays.toString(a));  // Here we print array string value before sorting. 
 
 Arrays.sort(a); // Here we use direct sorting method of array class. this method is able to change the original value of array thats why its mutable. 
 
 System.out.println(Arrays.toString(a));  // after sorting we again print a value. 
 
 
// immutable : in this we are not able to change the original value. after storing value in another variable the we are able to change original value. 
 
 String b=new String("welcome");
 
 String conca = b.concat("to java");  // Here we use string class method concat. and store the concat method value in conca variable. 
 
 System.out.println(conca);  // its not change its original value this is called immutable. 
                            // if we store concat method in string variable then its connecting the string. before it prints its original value. 
 
 
// String - immutable 
 
 String s = "Welcome";
 
 s.concat("To java"); // Here we use concat method of string class.
 
 System.out.println(s); // after concatenation we print the value it will return original value not concatenation value. 
                       // Thats why string is immutable it cannot change original value. 
 
 
// StringBuffer - mutable 
 
 StringBuffer bfr = new StringBuffer("Welcome");
 
 bfr.append("to java");  // in stringBuffer we have another method to concatenation it is append. 
 
 System.out.println(bfr); // Here after concatenation we get concatenated value not original value.  
                          // The original value is change by this method thats why StringBuffer is mutable. 
 
 
// StringBuilder - mutable 
 
 StringBuilder bui = new StringBuilder("Java");
 
 bui.append("Programing language"); // in stringBuilder we have another method to concatenation it is append. 
 
 System.out.println(bui);  // Here after concatenation we get concatenated value not original value.  
                           // The original value is change by this method thats why StringBuilder is mutable. 
	}

}
