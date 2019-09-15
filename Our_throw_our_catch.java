package arvind;


public class Our_throw_our_catch {
	public static void main(String[]args)
	{
		int balance= 5000;
		int withdrawn=6000;
		try
		{
			if(balance<withdrawn)
				throw new ArithmeticException("Insufficient Amount");
			balance=balance-withdrawn;
			System.out.println("transaction successfull");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
	System.out.println("Process continue");
	}
	/* yaha msg Insufficent balance print hoga bcs ye hmne set kiya h jese exception me divide by zero vala hota h vese but cathch bhi hmara bnaya hua h so uske badd "process continue vala print hoga"*/
	

}
