package collection;
import java.util.*;
public class HashSet_Collection {
	public static void main(String[]args)
	{
		HashSet<Comparable> h=new HashSet<Comparable>();
		h.add("b");
		h.add("Q");
		h.add(4);
		h.add("A");
		h.add(9);
		h.add("null");
		h.add("b");//b 2 baar aaya but nhi lega
		System.out.println(h.add(4));//false aaega bcs 4 already h
		System.out.println(h);
	}
}
//insertion order bhi alg h jesa dala vesa nhi aaya