package collection;
import java.util.*;
public class Cursor_Enumeration {

public static void main(String[]args)	
{
	Vector<Integer> v=new Vector<Integer>();
	for(int i=0;i<=10;i++)
	{
		v.addElement(i);
		
	}
	System.out.println(v);
	Enumeration<Integer> e=v.elements();
	while(e.hasMoreElements())
	{
		Integer I=(Integer)e.nextElement();
		if(I%2==0)
			System.out.println(I);
	}
	System.out.println(v);
}

}
