package collection;
import java.util.*;
public class List_Iteration_cursor {

	public static void main(String[]args) {
		
				LinkedList<Comparable> l=new LinkedList<Comparable>();
				l.add("Arvind");
				l.add("Ranu");
				l.add("Anuradha");
				l.add("neetu");
				l.add("Abhishek");
				System.out.println(l);
			ListIterator<Comparable> ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("Abhishek"))
			{
				ltr.remove();
			}
			else if(s.equals("neetu"))
			{
				ltr.add("Raju");
			}
			else
				ltr.add(5);
	
		}
	
	System.out.println(l);
	}
}
