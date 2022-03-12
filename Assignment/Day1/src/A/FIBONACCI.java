package A;
import java.util.Scanner;
public class FIBONACCI {
	public static void main(String[] args)
	{
		
	Scanner s = new Scanner (System.in);
    System.out.println("Enter the number of terms");
    int row = s.nextInt();
	int a=0;
	int b=1;
	int temp=0;
	System.out.print(a+ " " +b+" ");
	
	for(int i=2;i<row;i++)
	   { 
	     temp=a+b;
	     a=b;
	     b=temp;
	     System.out.print(temp+" ");
	     
	   }

	}		

}
