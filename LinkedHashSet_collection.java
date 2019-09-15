package collection;
import java.util.*;
public class LinkedHashSet_collection {
	public static void main(String arg[])
	{
		LinkedHashSet<Comparable> h=new LinkedHashSet<Comparable>();
		h.add("L");
		h.add("o");
		h.add(4);
		h.add("D");
		h.add("A");
		h.add(null);
		h.add(123);
		System.out.println(h.add(4));//4 already h so false return krega
		System.out.println(h);
		
	}
}
