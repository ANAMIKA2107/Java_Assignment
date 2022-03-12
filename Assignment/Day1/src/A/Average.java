package A;
import java.util.Scanner;

public class Average {
	public static void main(String[] args)
	{ Scanner s=new Scanner(System.in);
	  System.out.println("ENTER THE NO.OF STUDENTS");
	  int a=s.nextInt();
	  int sum=0;
	  for(int i=0;i<a;i++)
	  { System.out.println("ENTER THE grade of"+" "+(i+1)+"student");
	    int m=s.nextInt();
	    sum=sum+m;
	  }
	  float avg=(sum/a);
	  System.out.println("Average is"+" " +avg);
    }
 }
