package ageofperson;
import java.util.Scanner;
public class age
{   

	public static void checkDetails(String FirstName,String LastName,int age)throws userdefinedexceptionclass
	{
		try
		{
		if(age>=18 && age<60) System.out.println("Age of "+FirstName+" "+LastName+" is between 18-60.");
		else throw new userdefinedexceptionclass("Age of "+FirstName+" "+LastName+" is not between 18-60");
		}catch(Exception f)
		{
			throw new userdefinedexceptionclass(f.getMessage());
		}
		}
	
	public static void main(String gg[])
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("first name : ");
		 String personFirstName = scanner.next();
		 System.out.println("last name : ");
		 String personLastName = scanner.next();
		 System.out.println("age : ");
		 int age =scanner.nextInt();
		 
		 try {
		 	    
			checkDetails(personFirstName,personLastName,age);
			
		}catch(userdefinedexceptionclass g)
			{
				System.out.println(g.getMessage());
			}
	scanner.close();	
	}
}