package skyward;
import java.util.Scanner;
class SkywardClass {
private int studenthere[],studentids[];
private int x,y, gonecount,repeat,chosenstudent;
private int schedule[][],chosenclass;
private double total, studentscore, percentage, grades[][];
	Scanner reader=new Scanner(System.in);



//constructor
public SkywardClass()
{
	studenthere=new int [10];
	for(x=0;x<10;x++)
	{
		studenthere[x]=1;
	}
	studentids=new int [10];
	//make the student id numbers
	for(x=0;x<10;x++)
	{
		studentids[x]=x+1;
		
	}
	schedule=new int[10][4];
	grades=new double[10][4];
}

//read in the attendence
public void findattendence()
{
	//give instructions
	System.out.println("Who is here, enter a 1 for here, 0 for missing");
	//go through all 10 students
	for(x=0;x<10;x++)
	{
		//have a loop that will repeat if the if the input is incorrect
		do
		{
			//reset repet varable
			repeat=0;
			//ask for and take in the attedntence of a specific student 
		System.out.println("Student "+studentids[x]+":");
		studenthere[x]=reader.nextInt();
		//if the entered number was not a 1 or 0 then ask for a 1 or 0 and set repeat to 1 so the loop will repeat
		if(studenthere[x]!=1&&studenthere[x]!=0)
			{
			System.out.println("Please enter a 1 or a 0, try again");
			repeat=1;
			}
		//repeat untill the repeat isnt set to 1
		}while (repeat==1);
		
	}	
}

//print out the stuff about the attendence
public void printattendence()
{
	//reset the count varable to 0 at the start of the method
	gonecount=0;
	//go through each studnet 
	for(x=0;x<10;x++)
	{
		//if the her count is 0 then add 1 to the gone count
		if(studenthere[x]==0)
			gonecount++;			
	}
	//print out how many people were gone in total
	System.out.println("Their was " +gonecount+" students missing");
	if(gonecount>0) 
	{
		System.out.println("The list of students that were missing is ");
		//go through each stsuent, if they were set to 0 then print out that they were gone
		for(x=0;x<10;x++)
		{
			if(studenthere[x]==0)
				System.out.println("Student "+studentids[x]);
		
		}
	}
}

//read in student ID
public int ReadInStudent() {
	//set repeat back to 1 so we can enter the loop
	repeat=1;
	//repeat while ther reape varable is equal to 1
	while (repeat==1){
		repeat=0;
		//ask for the student
		System.out.println("Which students will you be refering to(enter ID number)");
		//subtra 1 for the array
		chosenstudent=reader.nextInt()-1;
		//if the numberisnt in the corrrect range then say so and ask for it again
		if(chosenstudent>10||chosenstudent<0){
			repeat=1;
			System.out.println("Plese enter a student id that is 1-10");
		}
	}
	//return the student id
	return chosenstudent;
}

//make the schedule
public void makeschedule()
{
	//read in the student we want to work with
	chosenstudent=ReadInStudent();
	//print out the class options to the user
	printclassoptions();
	//go through each class throughout the day
	for(y=0;y<4;y++)
	{
		//have a to repeat with wrong inputs
		repeat=1;
		while(repeat==1)
		{
			repeat=0;
			//ask for and take in the class they want to take
			System.out.println("What class would you like for your block" +(y+1));

			chosenclass=reader.nextInt();
			//if it isnt a class offered say that and set repeat to 1
			if(chosenclass>7||chosenclass<1)
			{
				repeat=1;
				System.out.println("Plese enter a class number that is listed");
			}
			
		}
		//set the chosen class to the spot in the 2-d array
		schedule[chosenstudent][y]=chosenclass;
	}
	
		
	
	
}

//print out the schedule for a given student
public void printschedule()
{
	//use the method to read in which student they want to be talking about
	chosenstudent=ReadInStudent();
	//say what we are printing out
	System.out.println("Their schedule from the start of their day to the end is ");
	//go through all 4 classes
	for(y=0;y<4;y++)
	{
		//have a switch that will take the number for the class and print it back out as the names of the class
	switch (schedule[chosenstudent][y])
	{
	case 1:
		System.out.println("Math");
		break;
	case 2:
		System.out.println("English");
		break;	
	case 3:
		System.out.println("Sciense");
		break;
	case 4:
		System.out.println("History");
		break;
	case 5:
		System.out.println("Engeniering");
		break;
	case 6:
		System.out.println("Culinary");
		break;	
	case 7:
		System.out.println("Comp Sci");
		break;
		//their isnt a valid number, or it is 0 print out that their isnt yet a class in te slot
	default:
	System.out.println("Their isnt a class in this slot");
	
	
	}
		
		
	}
	
	
	
	
}
//This method finds the percentage and grades for that student
	public void Choosegrades() 
	{
		//find student that we will be working on
		chosenstudent=ReadInStudent();
		//go through each block
		for(y=0;y<4;y++){
			//say the student that you will be working on and ask for and take in the points total and the points that they have
			System.out.println("You are currently adding in grades for student " + (chosenstudent+1) + " for block " + (y + 1) );
			System.out.println("Please enter in the total score: ");
			total = reader.nextInt();
			System.out.println("Please enter in the student's score: ");
			studentscore = reader.nextInt();
			//take the total points and divide them by what is avalable then time 100 to get it to a percent
			percentage = (studentscore/total);
			grades[chosenstudent][y] = percentage * 100;
		}
		
	}
	//method thta prints out the grades of a chosen student 
public void printgrades()
{
	//find the student that they want to find the grades of
	chosenstudent=ReadInStudent();
	//go through each block of the day
	for(y=0;y<4;y++){
		//say the block student and grades 
			System.out.println(("The grades for student " +chosenstudent+" for block "+(y+1)+" is "+ grades[chosenstudent][y]) + "%");
		}	
	
	
	
}
//print out all of the options for the different classes
public void printclassoptions()
{
	//print out all of the options for classes to take and their corrisponding number
	System.out.println("1. Math");
	System.out.println("2. English");
	System.out.println("3. Science");
	System.out.println("4. History");
	System.out.println("5. Engeniering");
	System.out.println("6. Culinary");
	System.out.println("7. Comp Sci");
	System.out.println("When refering to classes use the class's number");
	
}


}
