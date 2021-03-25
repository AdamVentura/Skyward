package skyward;

import java.util.Scanner;

public class SkywardMain {

	public static void main(String[] args) {
		// Create instance of class
		SkywardClass sc = new SkywardClass();
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// use on to store boolean value of whether or not the program is running
		boolean bOn = true;
		// Welcome user
		System.out.println("Hello, welcome to Skyward.");
		// Use while loop to keep program running
		while (bOn == true) {
		// Add a line of whitespace
		System.out.println();
			// Welcome user and prompt user to choose option
			System.out.println("Which of the following actions would you like to do (enter in a number 0-6):"
				+ "\n0. Quit Program"
				+ "\n1. Take Attendance"
				+ "\n2. Report Attendance"
				+ "\n3. Schedule Classes"
				+ "\n4. View Classes"
				+ "\n5. Assign Grades"
				+ "\n6. Report Grades");
			// Add a line of white space
			System.out.println();
			// Store answer in variable
			int iChoice = reader.nextInt();
			// Use switch statements to determine which method to call.
			switch (iChoice){
		
			case 0:
				System.out.println("You have quit the program.");
				bOn = false;
				break;
		
			case 1:
				sc.findattendence();
				break;
		
			case 2:
				sc.printattendence();
				break;
			
			case 3:
				sc.makeschedule();
				break;
		
			case 4:
				sc.printschedule();
				break;
			
			case 5:
			
				break;
			
			case 6:
				break;
			
			default:
				System.out.println("Please enter in a number 1-6.");
				break;
		
			}
		

	}

}
}

