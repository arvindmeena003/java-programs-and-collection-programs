package arvind;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class RemovingDublicateUsingLinkedHasSet {

	public static void main(String[] args) {int i;
		// TODO Auto-generated method stub

		//Array with duplicate elements
        //Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
	 Scanner s=new Scanner(System.in);
	 int t= s.nextInt();
	 for(int j=0;j<t;j++)
	 {
		 int x= s.nextInt();
	 
	 int y= s.nextInt();
		Integer[] number1 = new Integer[x]; 
		for(i=0;i<5;i++) {
        	 Scanner sc=new Scanner(System.in);
        	 number1[i]=sc.nextInt();
        	 
         }
        //This array has duplicate elements
        for(i=0;i<number1.length;i++)
        {System.out.print(" "+number1[i]);
        }
        System.out.println("\n");
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>(Arrays.asList(number1));
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates1 = linkedHashSet1.toArray(new Integer[] {});
         
        //Verify the array content
        //System.out.println( Arrays.toString(numbersWithoutDuplicates1) );
        
    	//Array with duplicate elements
        //Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
	
	 
		Integer[] number2 = new Integer[y]; 
		for(i=0;i<5;i++) {
        	 Scanner sc=new Scanner(System.in);
        	 number2[i]=sc.nextInt();
        	 
         }
        //This array has duplicate elements
        for(i=0;i<number2.length;i++)
        {System.out.print(" "+number2[i]);
        }
        System.out.println("\n");
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<>(Arrays.asList(number2));
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates2 = linkedHashSet2.toArray(new Integer[] {});
         
             int z= s.nextInt();
            int k;
            	 Integer[] number3 = new Integer[x];
            	 if(z==3)
            	 {
            	 for(k=0;k<numbersWithoutDuplicates2.length||k<numbersWithoutDuplicates1.length;k++)
             {
        
             number3[k]=numbersWithoutDuplicates1[k] ^ numbersWithoutDuplicates2[k];
             }
            	 }
            	 else     	 if(z==1)
            	 {
            	 for( k=0;k<numbersWithoutDuplicates2.length||k<numbersWithoutDuplicates1.length;k++)
             {
        
             number3[k]=numbersWithoutDuplicates1[k] & numbersWithoutDuplicates2[k];
             }
            	 }
            	 else    	 if(z==2)
            	 {
            	 for(k=0;k<numbersWithoutDuplicates2.length||k<numbersWithoutDuplicates1.length;k++)
             {
        
             number3[k]=numbersWithoutDuplicates1[k] | numbersWithoutDuplicates2[k];
             }
            	 }
            	 else     	 if(z==4)
            	 {
            	 for(k=0;k<numbersWithoutDuplicates2.length||k<numbersWithoutDuplicates1.length;k++)
             {
        
             number3[k]=numbersWithoutDuplicates1[k] - numbersWithoutDuplicates2[k];
             }
            	 }
            	 else     	 if(z==1)
            	 {
            	 for( k=0;k<numbersWithoutDuplicates2.length||k<numbersWithoutDuplicates1.length;k++)
             {
        
             number3[k]=numbersWithoutDuplicates2[k] - numbersWithoutDuplicates1[k];
             }
            	 }
            	 
            	 //LinkedHashSet<Integer> linkedHashSet4 = new LinkedHashSet<>(Arrays.asList(number3));
                 
                 //Get back the array without duplicates
                 //Integer[] numbersWithoutDuplicates3 = linkedHashSet4.toArray(new Integer[] {});
                  
                 //Verify the array content
                 System.out.println( Arrays.toString(number3) );
                 
	 }
	 
	}

}
