package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_exception {
	public static void main(String[] args) {
        try {
            // FileNotFoundException
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);

            // Read data from the file

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
    }
}


