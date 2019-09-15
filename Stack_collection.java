package collection;
import java.util.*;

public class Stack_collection {
		public static void main(String[]args)
		{
			Stack<String> s=new Stack<String>();
			s.push("a");
			s.push("C");
			s.push("B");
			System.out.println(s);
			System.out.println(s.search("A"));
			System.out.println(s.search("C"));
			s.pop();
			System.out.println(s);
		}
}
