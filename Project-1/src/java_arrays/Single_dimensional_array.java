package java_arrays;

public class Single_dimensional_array {

	public static void main(String[] args) {
		
// Deceleration of array approach 1. 
 
		int a [] = new int [5];   // To declare array we have to add data type variable new keyword again data type and how many values have to store. 
		
		a[0]=100;   // we can store values in array index from 0 to 4. If we know how many values we have to store at that time we use 1st approach. 
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;  
		
// Deceleration of array approach 2. 
		
		int b [] = {100,200,300,400,500};   // Deceleration and assignment at a single line. If we don't know how many values we have to store at that time we use 2nd approach.
		
// find length of array. 
		
		System.out.println(b.length);       // We use .length keyword to find the length of an array. 
		
		
// Read single value from an array. 
		
	System.out.println(a[2]);  // Here we have to specify the index no of array value. 	
		
// Reading all value from array. 
// Using normal for loop. 
		
		for (int i=0; i<a.length; i++) {    // We use length keyword to calculate the length of array. 
			
			System.out.println(a[i]);     // We use square brackets for value return variable in array. 
			
		}
		
// Enhance for loop / For each loop 
		
		for (int x : b) {       // in this loop we don't have condition & incrementation. 
			
			System.out.println(x);
		}
	}

}
