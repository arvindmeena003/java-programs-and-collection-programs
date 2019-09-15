package collection;
import java.util.*;

public class Linked_List {
		
	public static void main(String[]args)
	{
		LinkedList<Comparable> l=new LinkedList<Comparable>();
		l.add("arvind");
		l.add(123);
		l.add("abhishk");
		l.add("Neetu");
		System.out.println(l);
		l.set(2, "neetu ki maa");
		System.out.println(l);
		l.add(1,"Rama");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.addFirst("CCC");
		System.out.println(l);
	}

}
