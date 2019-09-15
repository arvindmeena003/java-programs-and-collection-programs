package arvind;
import java.util.Scanner;
public class Display_Array {
								public static void main(String[]args)
								{
									int i; int n;
									
									System.out.println("Enter the size of array/n");
									Scanner sc=new Scanner(System.in);
									  n=sc.nextInt();
									  int arr[]=new int[n];
									  System.out.println("enter the elements of array");
										for(i=0;i<n;i++)
										{
											arr[i]=sc.nextInt();
										}
										System.out.println("the list of array is/n");
										for(i=0;i<n;i++)
										{
											System.out.println("arr["+i+"]="+arr[i]);
										}
								}
}
