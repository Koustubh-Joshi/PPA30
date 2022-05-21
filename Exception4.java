//Concept of exception Handling issue in case of Array
import java.lang.*;
import java.util.*;

class Exception4
{
	public static void main(String arg[])
	{
		int Arr[] = {10,20,30,40,50};
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the index");
		int index = sobj.nextInt();
		try
		{
			System.out.println("Inside try");
			System.out.println("Elements of index is :"+Arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Inside catch");
			System.out.println(obj);
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		finally
		{
			sobj.close();
			System.out.println("Inside finally");
		}
		System.out.println("End of application");
	}
}