package collection;
import java.util.*;
public class Vector_collection {
			
			public static void main(String[]args)
			{
				Vector<Comparable> v=new Vector<Comparable>();
				System.out.println(v.capacity());
						for(int i=1;i<=10;i++)
						{
							v.addElement(i);
							
						}
						
					System.out.println(v.capacity());
					v.addElement("A");
					System.out.println(v.capacity());
					System.out.println(v);
			}
}
