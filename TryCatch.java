package Exception;

import java.util.Scanner;

public class TryCatch {
public static void main(String[] args) {
	int num1, num2 = 0, result = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number1: ");
	num1 = sc.nextInt();
	System.out.println("Enter a Number2: " + num2);
	try {
		// exception
		result = num1/num2;
	} catch (Exception e) {
		
		System.out.println(e);
		
	}
	
	System.out.println(result);
}
}
