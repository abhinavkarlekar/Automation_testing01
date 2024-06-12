package java_arrays;

public class Two_dimentional_array {

	public static void main(String[] args) {
		
// Deceleration of array approach 1. 
		
		int a [][] = new int [3][2];   // in 1st bracket we have to specify no of rows and in 2nd bracket we have to specify no of columns. here we specify 3 rows and 2 columns.
     // int [][] a = new int [][];     // we can put this brackets before the variable also. 
		
		a[0][0]=100;  // 1st row 1st column. 
		a[0][1]=200;  // 1st row 2nd column.    // The row and column index always start with 0. 
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
// Deceleration of array approach 2. 
		
		int b [][] = {{10,20},{30,40},{50,60}}; 
		
// Find size of array. 
		
		System.out.println("Length of rows : "+ b.length );  // the length keyword gives the total no of rows.
		
// to find how many columns in particular row we have to take at least 1 row. 	
		
		System.out.println("Length of columns : "+ b[0].length ); // we have to specify the row no. this will give no of columns in particular row.        
		
		
// Read single value from an array. 
		
   System.out.println(b[2][1]);   // We have to specify row no and column no of one specific value. 
   
// Read all values from array. 
// Here we need 2 loops 1 for row and 1 for column. 
// If we don't know the no of rows and columns then we use .length keyword. 
// Using nested for loop. 
   
   for (int r=0; r<=2; r++) {  // This is responsible for rows increment. 
	   
	   for (int c=0; c<=1; c++) {   // This is responsible for column increment.
		   
		   System.out.println(b[r][c]);  // Here we passing the row no and column no. 
		   
		   
// For each loop / Enhance for loop. 
		   
	for (int row[]:a ) {   // a variable representing the entire array. we take single dimensional array to store multiple values in single variable row [].
		
		for (int col : row) {
			
		System.out.println(col);
			
		}
	}
		   
		   
	   }  
   }
   
	}

}
