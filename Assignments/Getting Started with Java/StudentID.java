import java.util.Scanner;

public class StudentID
{
	/* Student ID Card Generator */
	public static void main(String[] args)
	{
	String studentName;
	int studentAge;
	String bloodGroup;
	String studentGroup = "";
	
	/* Scanning input data from the user */
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter your name :");
	studentName = reader.nextLine();
	System.out.println("Enter your age :");
	studentAge = reader.nextInt();
	System.out.println("Enter your blood group :");
	bloodGroup = reader.next();
	
	/* Deciding the `studentGroup` based on the age */
	if (studentAge >= 20)
	{
		studentGroup = "RED";
	}
	else if (studentAge >= 15 && studentAge < 20)
	{
		studentGroup = "BLUE";
	}
	else if (studentAge >= 10 && studentAge < 15)
	{
		studentGroup = "YELLOW";
	}
	
	/* Printing the ID-Card */
	System.out.println("----------------------------------");
	System.out.println("Name: " +studentName);
	System.out.println("Age: " +studentAge);
	System.out.println("Blood Group: " +bloodGroup);
	System.out.println("----------------------------------");
	System.out.println("Your group is " +studentGroup);
	System.out.println("----------------------------------");
	
	reader.close();
	}
}
