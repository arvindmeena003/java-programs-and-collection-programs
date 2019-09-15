package arvind;

import java.util.Scanner;

public class Pyramid_Structure {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
			for(int i=0;i<n;i++)
				{for(int j=0;j<2*n-1;j++) {
					if(j>=n-(i-1)&& j<=n+(i-1))
						System.out.print("*");
					else 
						System.out.print(" ");
					
				}
			System.out.println(" ");
				}
	}

}
