package skyward;
import java.util.Scanner;
class SkywardClass {
private int studenthere[],studentids[];
private int x,y, gonecount,repeat,chosenstudent;
private int schedule[][],chosenclass;
	Scanner reader=new Scanner(System.in);
	



public SkywardClass()
{
	studenthere=new int [10];
	studentids=new int [10];
	//make the student id numbers
	for(x=0;x<10;x++)
	{
		studentids[x]=x+1;
		
	}
	schedule=new int[10][4];
}

//read in the attendence
public void findattendence()
{
	System.out.println("Who is here, enter a 1 for here, 0 for missing");
	
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
	System.out.println("The students list of students that were missing was...");
	//go through each stsuent, if they were set to 0 then print out that they were gone
	for(x=0;x<10;x++)
	{
		if(studenthere[x]==0)
			System.out.println("Student "+studentids[x]);
		
	}
}
	//This method chooses the student whose grades/schedule you want to edit
	public int ReadInStudent() {
	repeat=1;
	while (repeat==1){
		repeat=0;
		System.out.println("Which students scehdule would you like to input(enter ID number)");
		chosenstudent=reader.nextInt()-1;
		if(chosenstudent>10||chosenstudent<1){
			repeat=1;
			System.out.println("Plese enter a student id that is 1-10");
		}
	}
	return chosenstudent;
}
//make the schedule
public void makeschedule()
{
	
	chosenstudent=ReadInStudent();
	printclassoptions();
	for(y=0;y<4;y++)
	{
		repeat=1;
		while(repeat==1)
		{
			repeat=0;
			System.out.println("What class would you like for your block" +(y+1));

			chosenclass=reader.nextInt();
			if(chosenclass>7||chosenstudent<1)
			{
				repeat=1;
				System.out.println("Plese enter a class number that is listed");
			}
			
		}
		schedule[chosenstudent][y]=chosenclass;
	}
	
		
	
	
}
//print out the schedule for a given student
public void printschedule()
{
	
	chosenstudent=ReadInStudent();
	System.out.println("Their schedule from the start of their day to the end is ");
	for(y=0;y<4;y++)
	{
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
	default:
	System.out.println("Their isnt a class in this slot");
	
	
	}
		
		
	}
	
	
	
	
}
public void printclassoptions()
{
	System.out.println("1. Math");
	System.out.println("2. English");
	System.out.println("3. Science");
	System.out.println("4. History");
	System.out.println("5. Engeniering");
	System.out.println("6. Culinary");
	System.out.println("7. Comp Sci");
	System.out.println("When refering to classes use the classes number");
	
}




}
