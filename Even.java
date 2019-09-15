package arvind;
import java.util.Scanner;

public class Even {
		public static void main(String args[])
		{
			int x;
			System.out.println("enter the number/n");
			Scanner in = new Scanner(System.in);
			 x = in.nextInt();
			if(x%2==0)
			{
				System.out.println("the number=" +x +"is even");
			}
			else
				System.out.println("the number=" +x +"is odd");
		}

	}


