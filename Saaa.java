package arvind;
import java.util.*;
import java.util.Scanner;

public class Saaa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=0;
		for(int m=0;m<x;m++)
		{  int y;
			y=sc.nextInt();
			String str = Integer.toBinaryString(y); 
		//System.out.println(str);

        int n = str.length(); 
        Saaa permutation = new Saaa(); 
        sum= permutation.permute(str, 0, n-1);
        System.out.println(sum);
	}
            
        } 

	  int permute(String str, int l, int r) 
    { int k;int s=Integer.parseInt(str);;
   
    k=Integer.parseInt(str);
    s=s+k;
   
        if (l == r) 
        {	//System.out.println(str);
        k=Integer.parseInt(str);
       // System.out.println(k);
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
                k=Integer.parseInt(str);
              //  System.out.println(k);
                
            } 
        } 
    
    
    return s;} 
	public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  

} 

	

