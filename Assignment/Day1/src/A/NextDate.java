package A;

import java.util.Scanner;
public class NextDate {
 
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int date,month,year;
        System.out.println("enter date");
        date=s.nextInt();
        System.out.println("enter month");
        month=s.nextInt();
        System.out.println("year");
        year=s.nextInt();
        
        int a[]= {-1,31,28,31,30,31,30,31,31,30,31,30,31} ;
        
        if((year%4)==0 || (year%400)==0 && (year%100)!=0)
        {a[2]=29;
        }  
     date=date+1;
     if(date>=31 && month>=12)
     {
    	month=0;
    	year=year+1;
     }
     if(date>a[month])
     {date=1;
      month=month+1;
    	 
      }
     
     System.out.println("next date is"+ " "+date+"/"+month+"/"+year);
     
    }
}    