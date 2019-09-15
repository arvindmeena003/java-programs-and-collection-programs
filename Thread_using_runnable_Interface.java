/* yha hmko 3 kaam krne hote h 1. thread bnana 2. code attached krna thread se 3. thread ko chalu krna */
package arvind;
import java.lang.Runnable;
class A implements Runnable
{
	public void run()
	{int i;
		for(i=0;i<=10;i++)
			System.out.println("Thread A"+i);
	
	 }
}
class B implements Runnable
{
	public void run()
	{int i;
		for(i=0;i<=10;i++)
			System.out.println("Thread B"+i);
	
	}
}
public class Thread_using_runnable_Interface {

	public static void main(String[]args)
	{
		Thread t1=new Thread(new A());//thread banaya and code attached kiya
		Thread t2=new Thread(new B());//dusra thread bnaya and code attached kiya
		t1.start();//thread ko start kiya
		t2.start();//thread ko start kiya
	}
	/* isme output kuch bhi aa sakta h because jo java ko thik lgega usko run krta jega*/
}
