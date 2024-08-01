package Exception;

public class ArrayIndex {

public static void main(String[] args) {
		
		System.out.println("ArrayIndexOutOfBoundsException");

		int arr[] = new int[5];
		try {
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("StringIndexOutOfBoundsException");
		
		String str = "Nithi";
		
		try {
			System.out.println(str.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
}
}
