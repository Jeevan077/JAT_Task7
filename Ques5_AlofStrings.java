package exceptionhandling.JAT_Task7;

import java.util.ArrayList;

public class Ques5_AlofStrings {
	
	//Removal of all elements from the arraylist

	public static void main(String[] args) {
		
		ArrayList <String> als=new ArrayList<> ();
		als.add("Rose");
		als.add("Jasmine");
		als.add("Margo");
		als.add("Sunflower");
		System.out.println("Arralist before removal : "+als);
		
		als.removeAll(als);
		System.out.println("Arraylist after removal :"+als);

	}

}

//Output:
/*
 * Arralist before removal : [Rose, Jasmine, Margo, Sunflower]
Arraylist after removal :[]
*/
