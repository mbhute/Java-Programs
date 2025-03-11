package IfElse;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class readlinebylinescanner {

	public static void main(String[] args) {
	Scanner scanner = null;
	try {
		scanner = new Scanner(new File("C:\\Users\\mbhut\\OneDrive\\Documents\\readfile.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

		scanner.close();	}

}
