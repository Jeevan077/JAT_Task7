package exceptionhandling.JAT_Task7;

public class Ques1_div {
	
	public static void div(int a ,int b) throws ArithmeticException  //Throws keyword is used by calling method
	{
	       if (b==0)
				{
			throw new ArithmeticException ();
				}
				else
				{
					int c=a/b;
					System.out.println(c);
				}
	}

	public static void main(String[] args) {
		
              Ques1_div obj=new Ques1_div();
              {
            	  try
            	  {
            		  obj.div(20, 0);
            		  System.out.println(obj);
            	  }
            	  catch(ArithmeticException e)
            	  {
            		  System.out.println("The ErrorMessage is : "+e);
            	  }
              }
	}

}

//Output:
/*
The ErrorMessage is : java.lang.ArithmeticException
*/
