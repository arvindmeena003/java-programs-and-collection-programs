package arvind;
import java.util.Scanner;
public class Remove_dublicate_array {

	public static void main(String[] args) {
		System.out.println("enter the array size");
		 Scanner s=new Scanner(System.in);
		 int x= s.nextInt();
		 int arr[]=new int[x];
		 for(int i=0;i<x;i++)
		 {
			 arr[i]=s.nextInt();
		 }
		 for(int i=0;i<x;i++)
		 {
			 for(int j=i+1;j<x;)
			 {
				 if(arr[i]==arr[j])
				 {
					 for(int k=j;k<x;k++)
					 {
						 arr[j]=arr[j+1];
					 
					 }
					 x--;			
					 }
				 else
					 {
					 j++;
					 }
			 }
		 }
		 System.out.println("arr is");
		 for(int i=0;i<x;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

}
