package arvind;
import java.util.Scanner;

public class Minus {
		 
	
	   public static void main(String args[])
	   {
	      int x, y, z;
	 
	      System.out.println("Enter two integers to calculate their diff");
	      Scanner in = new Scanner(System.in);
	     
	      x = in.nextInt();
	      y = in.nextInt();
	      z = x - y;
	     
	      System.out.println("diff of the integers = " + z);
	   }
	}

