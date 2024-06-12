package java_string_class;

public class String_class_methods {

	public static void main(String[] args) {
	
/*We can declare a string variable in 2 way.
		
1) Using string literal 
		
	String s = "Welcome"; 
		
2) Using new keyword. 
		
	String s=new String("Welcome");  
*/
		
		
// Methods in String class. 
		
// 1) Length (); :- To get the length of the character present in string This method gives int value. 
		
		String s= "Welcome"; 
		int l = s.length(); // We store length method value in l variable 
        System.out.println(l); // we print the value of l that returns the length of string. 
        
       // Output : 7
        
        
// 2) replace :- To replace some character from given string. ("old char", "new char") This method return string value. 
//    Here you need to pass one string character and second new character in double quote or single quote. 
        
        String r = "Java";
        String a = r.replace("J", "v"); // Here we add the character which we want to replace and in 2nd quote character which is replace with. 
        System.out.println(a);
        
        // Output : vava 
        
        
// 3) indexOf(); :- To get index/position of character in string. This method return int value. Here pass a single character in double or single quote. 
//    The index starts from zero. If space is present in string, then it will count space.
        
        String i = new String ("Java-Automation........"); 
        System.out.println("Index of Character is:-"+i.indexOf("A"));
        
     // Output : Index of Character is:-5  
        
        
// 4) Substring (int beginning index, int ending index); : To get Substring (some characters in string) with respect to index in string.
//    this method accepts two indexes like beginning index and ending index. The ending index will not show in the output. 
        
        String sub = new String ("Java-Automation........");
        System.out.println("Substring is :-" +sub.substring(5));
        System.out.println("New String is:-" +sub.substring(1, 15));
        
     // Output Substring is: -Automation........
     //        New String is: ava-Automation
        
        
// 5) charAt(int index); : To get character with respect to index. This method accepts int index and get output. Return type of this method is char data type.
        
        String t = new String ("How? Are You?"); 
        System.out.println(t.charAt(3));
        
    // Output- ?
        
 
// 6) concat(another string); : To add another string in given string. The return type of this method is string. You can use + operator to join two strings.
        
        String con = "Nagpur";
        System.out.println(con.concat(" Is Orange City")); // Here we use concat method to add another string. 
        
        System.out.println(con + "Big City"); // Here we use + operator to concat 2 strings. 
       
     // Output : Nagpur Is Orange City
     // Nagpur Big City
        
        
// 7) toLowercase(); : To make string in lower case. The return type of this method is string.
       
        String w = "ABHINAV";
        System.out.println(w.toLowerCase()); 
        
     // output : abhinav
        
        
// 8) toUppercase(); : To make a string in Upper case. The return type of this method is string.
       
        String p = "karlekar";
        System.out.println(p.toUpperCase()); 
        
        // output : KARLEKAR 
        
     
// 9) trim(); : To remove beginning and ending spaces from string. The return type of this method is string.
        
        String r1 = "   Chandrapur   ";
        System.out.print(r1.trim());
        System.out.print(" cd");
        
       //  Output : Chandrapur cd 
        
        
// 10) isempty(); : To check string empty or not. This method returns Boolean value. If string contain characters then it gives false.
//     If the string doesn't contain any characters then it gives true.
       
        String a1 = new String ("");
        System.out.println(a1.isEmpty()); 
        
     // Output : true
        
        
// 11) contains(Sequence of character); : . To check some characters which is present in string or not. This method returns a Boolean value. 
//     If character is present then it gives true and character is not present then it gives false. You need to pass a sequence of characters 
//     as per the given string. You can pass more than once character in this method.
       
        String m ="given"; 
        System.out.println(m.contains("g")); 
        
        // Output : true
        
        
// 12) equals(string variable/string); : To compare two string value is same or not. This method returns a Boolean value. This method accepts string variable and string.
        
        String a11 = "ab";
        String b = "cd";
        System.out.println(a11.equals("ab"));
        System.out.println(b.equals(a)); 
        
        // Output : true , False
        
        
// 13) equalsIgnorecase(string variable/string); : To ignore case of string between two string value. This method returns a Boolean value. This method accept string variable and string.
        
        String ab = "TRAIN";
        String xy = "train";
        System.out.println(ab.equalsIgnoreCase ("TraIN"));
        
        // Output : true
        
        
// 14) endswith("last characters"); : To check ending characters in string. This method returns a Boolean value. 
//     Insert the last character in this method, if character is present it will give true otherwise false. 
        
        String op = "Sunday";
        System.out.println(op.endsWith("y"));
        
        // Output : true
        
        
// 15) To Print each character of string in forward Direction - Suppose you want print each character of String in forward direction then you need to 
//     go with for loop. Initialization one int variable. Now int variable less than string.length() and then increment variable.
//     Inside loop, used charAt() method with argument as your int variable with help of the reference variable of string.
       
        String m1 = "You Will do Great.!"; 
        for (int x =0; x<m1.length(); x++)
        { 
        	System.out.print(m1.charAt(x)+" ");
        }
        
        // Output : Y o u   W i l l   d o   G r e a t . ! 
        
        
// 16) To Print string character in reverse direction - Suppose you want print each character of string in reverse direction, use for loop.
//     Initialization int variable which start from string.length()-1, here -1 used because string length include +1 index. 
//     Now int variable is greater than equal to 0. After that variable decrement.
//     Inside loop, used charAt() method with argument as loop variable with help of reference variable of string.
        
        
        String m11 = "You Will do Great.!"; 
        for(int y=m11.length()-1; y>=0; y--) 
        {
        System.out.print(m11.charAt(y)+" ");
        }
        
        
      //  Output : ! . t a e r G   o d   l l i W   u o Y 
        
        
// 17) split(); : To Break/Split the string String Length include white space. Suppose you want Split on string, You can used split() method with 
//     reference variable of string. Split method accept argument as portion of string that you want split string. It may be character, white-space, colon:, Underscore, hyphen- etc
//     After split method used, it will convert into array which start from zero index and store in one variable of Array.
//     Suppose you want remove white space, you can use trim() method with the reference variable of string.
       
        
        // Example 1 : Split with space. 
    
        String s1 = "Print character";
        String[] op1 = s1.split(" "); 
        System.out.println(op1[0]);
        
        System.out.println(op1[1]);
        
        // Output : Print
        //          character
        
        
// Example 2 : Split with hyphen. 
        
        String w1 = "To-Check-ending-character-of-String"; 
        
        String[] ab1 = w1.split("-");
     
        // for each loop
        
     for (String cd:ab1) {
     System.out.println(cd);
     }
     
     // for loop
     
     for(int i1 = 0; i1<ab1.length;i1++) {
     //
     System.out.println(ab1[i1]);
     }
     
     // Output : To
     //          Check
     //          ending
     //          character
     //          of
     //          String
     
     
// Example 3 : Split with character. 
     
     String j = "character";
     
     String[] n = j.split("c");
     
     // for each loop
     for (String pr: n) {
     System.out.println(pr);
     }
     
     // Output : hara
     //          ter

    
	}

}
