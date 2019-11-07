package rokey;

public class Student {
	
	
		//attributes 
	
	private String fName;
	private String lName;	
	private String sId;
	private String major;
	private String address;
	private String city;
	private String state;
	private String zip;
	private double gpa;
	
	//constructor 
	
	public Student(String fn, String ln, String sid, String m, String a, String c, String s, String z, double g) 
	
	{	
	
		fName = fn;
		lName = ln;
		sId = sid;
		major = m;
		address = a;
		city = c;
		state = s;
		zip = z;
		gpa = g;
		
	}
	
	//constructor 
	
	public Student(String fn, String ln, String a, String c, String s, String z) 

	
	
		{
			fName = fn;
			lName = ln;
			sId = null;
			major = null;
			address = a;
			city = c;
			state = s;
			zip = z;
			gpa = 0.0;
		}
			//methods 
	
			public String getlastName()
			{
				return lName;
			}
			public String getName()
		
			{
				return fName + " " + lName;
			}
		
			public String getsId()
			
			{
				return sId;
			}
			public String getmajor()
			
			{
				return major;
			}
			
			public String getaddress()
			
			{
				return address + " "  + city + ", " + state + " " + zip;
			}
			
			public double getgpa()
			
			{
				return gpa;
			}
			
			public void setaddress(String a, String c, String s, String z)
			
			{
				address = a;
				city = c;
				state = s;
				zip = z;
			}
			
			public void setmajor(String m)
			
			{
				major = m; 
			}
			
			//methods 
			public boolean equals(Student other)
			
			{
				if(sId.equals(other.sId))
					return true;
				else
					return false; 
			}
			
			public String toString()
			
			{
				return "Name: " + fName + " " + lName + 
						"\n" + "Student ID: " + sId + 
						"\n" + "Major: " + major + 
						"\n" +  "Address: " + address + " " + city + ", " +  state + " " +  zip + 
						"\n" + "GPA:" + gpa;
			}
		
			
				
}