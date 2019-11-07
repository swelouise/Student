package rokey;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException; 
import java.io.FileOutputStream;

public class rokeystudent {

		public static void main(String[] args) 
		{
			Scanner inFile = null;
			PrintWriter outFile = null;
			
			
			String fName;
			String lName;	
			String sId;
			String major;
			String address;
			String city;
			String state;
			String zip;
			double gpa;
			
			Student temp;
			
			Student[] students = new Student [10];
			int count = 0;
			
			// open files
			
				
				try
				
				{
					inFile = new Scanner(new FileInputStream("studentinfo.txt"));
					outFile = new PrintWriter(new FileOutputStream("studentinfo2.txt"));
				}
				
				catch (FileNotFoundException e)
				
				
				{
					System.out.println("file not found");
					System.exit(0);
				}
			
				
		//load student info into array 
		while(inFile.hasNextLine() && count < students.length)
		{
			fName = inFile.nextLine();
			lName = inFile.nextLine();
			sId = inFile.nextLine();
			major = inFile.nextLine();
			address = inFile.nextLine();
			city = inFile.nextLine();
			state = inFile.nextLine();
			zip = inFile.nextLine();
			gpa = inFile.nextDouble();
			inFile.nextLine();
			students[count] = new Student(fName, lName, sId, major, address, city, state, zip, gpa);
			count ++;
		}
		
		//sort the student info in the array by last name
		
	for(int p = 0; p < count -1; p++)
		for(int c = 0; c < count -1; c++ )
	{
			
			if(students[c].getlastName().compareTo(students[c+1].getlastName()) > 0)
			{
				temp = students[c];
				students[c] = students[c+1];
				students[c+1] = temp;
			}
	}
	//Output the student array information into a file
	for(int i = 0; i < count; i++)
		outFile.println(students[i]);
		
		//close
		inFile.close();
		outFile.close();

		}
			}	



