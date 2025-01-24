package exceptionhandling.JAT_Task7;

public class Ques3_InvalideAge {
	
	public static void Checkage (int age)
	{
	if (age<18)
	{
		throw new ArithmeticException ("InvalidAgeException");
	}
	}

	public static void main(String[] args) {
		
		Checkage(16);
	}
}

//Output:
/*
 * Exception in thread "main" java.lang.ArithmeticException: InvalidAgeException
	at exceptionhandling.Ques3_InvalideAge.Checkage(Ques3_InvalideAge.java:9)
	at exceptionhandling.Ques3_InvalideAge.main(Ques3_InvalideAge.java:15)
*/
