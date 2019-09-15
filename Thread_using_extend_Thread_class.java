/* yha hmko 3 kaam krne hote h 1. thread bnana 2. code attached krna thread se 3. thread ko chalu krna */
package arvind;
import java.lang.*;
class C extends Thread
{
	public void run()
	{
	int i;
	for(i=0;i<5;i++)
		System.out.println("i="+i+"thread C");
	}
}
class D extends Thread
{
	public void run()
	{
	int i;
	for(i=0;i<5;i++)
		System.out.println("i="+i+"thread B");
	}
}
public class Thread_using_extend_Thread_class {
	public static void main(String[]args)
	{
		C o1=new C();
		D o2=new D();
		o1.start();
		o2.start();
	}

}
