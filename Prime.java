package arvind;

import java.util.Scanner;

public class Prime {


public static void main(String args[])
{
	
	int x;
	int i;
	System.out.println("enter the numbers\n");
	Scanner in = new Scanner(System.in);
    
    x = in.nextInt();
	 if(x==1)
		 System.out.println("the number is not prime");
	 else if(x==2 || x==3)
		 System.out.println("the number is prime");
	 else
	 for(i=2;i<=x/2;i++)
	 			{
		 if(x%i==0)
			 {
			 System.out.println("the number is not prime");
			 break;
			 }
		
	}
	 System.out.println("the number is prime");
	 }
	 
}


