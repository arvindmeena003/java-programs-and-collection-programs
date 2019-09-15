package arvind;
import java.util.Scanner;
public class Secound_largest {

	public static void main(String[] args) {
			int n;
			System.out.println("enter the array element size");
			Scanner s= new Scanner(System.in);
			n=s.nextInt();
			int arr[]=new int[n];
			System.out.println("enter the array elements");
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			int largest=arr[0];
			int seclargest=arr[1];
			for(int j=0;j<n;j++)
			{
				if(arr[j]>largest)
				{
					seclargest=largest;
					largest=arr[j];
				}
				else if(arr[j]>seclargest && arr[j]!=largest)
				{
					seclargest=arr[j];
				}
			}
			System.out.println("largest = "+largest+" secondlargest= "+seclargest);
	}
}