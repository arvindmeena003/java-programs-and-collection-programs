package arvind;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class RemovingDublicateUsingLinkedHasSet {

	public static void main(String[] args) {int i;
		// TODO Auto-generated method stub

		//Array with duplicate elements
        //Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
		Integer[] numbers = new Integer[5]; 
		for(i=0;i<5;i++) {
        	 Scanner sc=new Scanner(System.in);
        	integer number[i]=sc.nextInt();
        	 
         }
        //This array has duplicate elements
        for(i=0;i<numbers.length;i++)
        {System.out.print(" "+numbers[i]);
        }
        System.out.println("\n");
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
        
        
	}

}
