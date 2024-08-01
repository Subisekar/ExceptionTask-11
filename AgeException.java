 
package Exception;

import java.util.Scanner;

public class AgeException {
public static void main(String[] args) {
	

	AgeMymain obj = new AgeMymain();

	try {
		obj.ageCalc(13); 
	} catch (AgeException e) {
		System.out.println(e);
	}
}


public void ageCalc(int age) throws AgeException {
	if (age > 60) {
		System.out.println("Senior Citizen");
	} else if (age > 30) {
		System.out.println("Adult");
	} else if (age > 18) {
		System.out.println("New Adult");
	} else {
		throw new AgeException("InvalidAgeException");
	}

	
}
}
