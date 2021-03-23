package skyward;
import java.util.Scanner;
class SkywardClass {
private int studenthere[],studentids[];
private int x,gonecount,repeat;
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
}


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
//
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


}
