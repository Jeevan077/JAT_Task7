package exceptionhandling.JAT_Task7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ques4_Files {

	public static void main(String[] args) {
		
		try {
			FileReader filer=new FileReader("Text.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("The Error Message is : "+e);
		}
		

	}

}

//Output:
/*
 * java.io.FileNotFoundException: Text.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
	at java.base/java.io.FileReader.<init>(FileReader.java:60)
	at exceptionhandling.Ques4_Files.main(Ques4_Files.java:11)
The Error Message is : java.io.FileNotFoundException: Text.txt (The system cannot find the file specified)
*/
