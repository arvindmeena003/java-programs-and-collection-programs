package collection;
import java.util.*;

public class Array_list_collection {
		public static void main(String[]args)
		{
			ArrayList<Comparable> l=new ArrayList<Comparable>();
			l.add("A");
			l.add(10);
			l.add("c");
			l.add(null);
			System.out.println(l);
			l.remove(2);
			System.out.println(l);
			l.remove(1);
			System.out.println(l);
			l.add(1,"m");
			l.add(2,"D");
			System.out.println(l);
		}
}
