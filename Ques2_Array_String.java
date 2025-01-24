package exceptionhandling.JAT_Task7;

public class Ques2_Array_String {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundException
		
		String s[]= {"Rose","Jasmine"};
		try
		{
			System.out.println(s[4]);
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundException is occoured");
		}
		//Output:
		/*
		 * ArrayIndexOutOfBoundException is occoured
		 */
		
		
		//StringIndexOutOfBoundException
		
		String name="Jeevan";
		{
			try
			{
				String m=name.substring(2,7);
				System.out.println(m);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("StringIndexOutOfBoundException is Occoured");
			}
		}
	}
	
	//Output:
	/*
	 * StringIndexOutOfBoundException is Occoured
	 */
	
	
}
