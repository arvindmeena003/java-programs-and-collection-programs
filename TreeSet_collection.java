package collection;
import java.util.*;

public class TreeSet_collection {

	public static void main(String[] args) {
			TreeSet<String> t=new TreeSet<String>();
			t.add("A");
			t.add("RR");
			t.add("VVV");
			t.add("iii");
			t.add("nnnn");
			//t.add(null);null is already included thats why exception aaya
			//t.add(10); heterogeneous data not allowed
			System.out.println(t);

	}

}
