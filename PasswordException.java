package Exception;

import java.util.Scanner;

public class PasswordException {
	public class LoginSystem {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			
			
			String password = "Nithi@123";
			String matchPassword;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Password: ");
			matchPassword = sc.nextLine();
			
			try {
				
				if(password.equals(matchPassword)) {
					System.out.println("Login Sucessfully");
				}
				else 
				{
					throw new Exception("Error Message");
				}
				
			} catch (Exception e) {
				
			System.out.println(e);
			}
			sc.close();
}
}
}