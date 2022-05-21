//Concept of exception Handling solution
import java.util.*;

class Exception2
{
	public static void main(String arg[])
	{
		int ans = 0, no1 = 0, no2 = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Please Enter first number");
		no1 = sobj.nextInt();

		System.out.println("Please Enter Second number");
		no2 = sobj.nextInt();

		try
		{
			ans = no1/no2;	//Exception Prone code
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception occureed as :"+obj);
		}
		finally
		{
			sobj.close();
		}

		System.out.println("Division is:"+ans);

		
		
	}
}