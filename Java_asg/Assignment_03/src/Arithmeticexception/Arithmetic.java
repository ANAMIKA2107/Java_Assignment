package Arithmeticexception;

import java.util.Scanner;
public class Arithmetic
{
	private static Scanner scanner1;
	public static int quo=0;

	public static void main(String gg[])
	{
	
		 try {
			 scanner1 = new Scanner(System.in);
			 System.out.println("Num1 : ");
			 int num1 = scanner1.nextInt();
			 System.out.println("Num2 : ");
			 int num2 = scanner1.nextInt();
			 quo=num1/num2;
			 }catch(ArithmeticException f)
			 {
				 System.out.println("DivideByZeroException caught inside finally block");
			 }
			 finally
			 {
				System.out.println("Inside finally block"); 
			 }
	}
}