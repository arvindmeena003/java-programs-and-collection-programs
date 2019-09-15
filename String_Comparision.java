package arvind;

public class String_Comparision {
	public static void main(String[]args)
	{
		String s1=new String("Arvind");
		String s2=new String("Meena");
		String s3=new String("Meena");
		if(s1.equals(s2))
			System.out.println("String s1 and s2 are equal");
		else
			System.out.println("String s1 and s2 are not equal");
		if(s2.equals(s3))
			System.out.println("String s2 and s3 are equal");
		else
			System.out.println("String s2 and s3 are not equal");
		
	}

}
