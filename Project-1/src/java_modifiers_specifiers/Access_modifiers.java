package java_modifiers_specifiers;

public class Access_modifiers {

/* There are 4 types of access modifiers in java. 
* The access modifiers defines a scope of variables and methods. 
 1) Public : access with in class , outside class , within package, outside package. 
 2) Protected : access within class , outside class , within package, outside package by inheritance.
 3) Default : if we do not mention any access modifier it will consider it as a default. access with in class , outside class , within package, but not outside package. 
 4) Private : access only within class not outside class. 
 
 * Class only support Public and Default access modifiers. 
 * Method support Public, Protected, Default, Private access modifiers. 
 * Variable support Public, Protected, Default, Private access modifiers.
 * Constructor support Public, Protected, Default, Private access modifiers.
 */
	
	
public void abc () {              // Public access modifier. 
	
} 

protected void xyz () {           // Protected access modifiers. 
	
}

void cde () {                     // Default access modifiers. 
	
}

@SuppressWarnings("unused")
private void z () {               // Private access modifiers. 
	
} 
	public static void main(String[] args) {
		

	}

}
