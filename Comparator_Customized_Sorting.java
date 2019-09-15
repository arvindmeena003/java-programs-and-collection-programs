package collection;
import java.util.*;

public class Comparator_Customized_Sorting {

	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
					t.add(5);
		t.add(535);
		t.add(524);
		t.add(555);
		t.add(56);
		t.add(45);
		System.out.println(t);
	}

}
class MyComparator implements Comparator<Object>
{
	public int compare(Object obj1,Object obj2)
	{	
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;
}
}
