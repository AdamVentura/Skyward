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
		// Use while loop to keep program running
		while (bOn == true) {
		
		// Welcome user and prompt user to choose option
		System.out.println("Hello, welcome to Skyward. "
				+ "If you'd like to quit this program enter '0'. "
				+ "\nIf not, which of the following actions would you like to do (enter in a number 1-4):"
				+ "\n1. Take Attendance"
				+ "\n2. Schedule Classes"
				+ "\n3. View Classes"
				+ "\n4. Assign Grades"
				+ "\n5. Report Grades");
		// Store answer in variable
		int iChoice = reader.nextInt();
		// Use switch statements to determine which method to call.
		switch (iChoice){
		
		case 0:
			bOn = false;
			break;
		
		case 1:
			sc.findattendence();
			break;
			
		case 2:
			sc.makeschedule();
			break;
		
		case 3:
			sc.printschedule();
			break;
			
		case 4:
			
			break;
			
		case 5:
			break;
			
		default:
			System.out.println("Please enter in a number 1-5.");
			break;
		
		}
		

	}

}
}
