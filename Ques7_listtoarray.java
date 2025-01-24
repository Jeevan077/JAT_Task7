package exceptionhandling.JAT_Task7;

import java.util.ArrayList;

public class Ques7_listtoarray {

	public static void main(String[] args) {
		
		  ArrayList<String> languages= new ArrayList<>();
			
	   		// Add elements to ArrayList
			languages.add("Java"); 
			languages.add("Python");
			languages.add("Cscripts");
			languages.add("C++");
			
			//Printing the Size of ArrayList
			
			int s=languages.size();
			//System.out.println(s);
			
			//Declaring an Array
			
			String[] arl=new String[s];
			
			// Convert list to array
			
			languages.toArray(arl);  
			
			//Using Advanced For Loop
			
		    for (String r:arl) {
				System.out.println(r);
		    }    		

		}
	}

//Output:
/*
Java
Python
Cscripts
C++
*/
