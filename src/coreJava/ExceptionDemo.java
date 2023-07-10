package coreJava;

public class ExceptionDemo {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		//3 lines of code - try catch mechanism
		
		int b = 7;
		int c = 0;

		//One try can be followed by multiple catch blocks
		//Catch should always be followed by Try block
		
		try
		{
			//int k = b/c;
			
			int arr[] = new int[5];
			System.out.println(arr[7]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Index error");

		}
		catch(Exception e)
		{
			//Purchase failed, try again
			System.out.println(e);
		}
		finally
		{
			//This block is executed irrespectively of exception thrown or not
			System.out.println("Delete Cookies");
			
			//Finally block will not execute ONLY if you terminate the JVM by clicking the STOP button
			//On Eclipse
		}
}

	}


