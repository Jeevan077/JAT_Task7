package exceptionhandling.JAT_Task7;

import java.util.TreeMap;

public class Ques6_Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tree=new TreeMap<> ();
		
		//TreeMap of Employee Ids and names
		tree.put(01, "Jeevan");
		tree.put(05,"Mohan");
		tree.put(02, "Sugan");
		tree.put(04, "Kumar");
		
		//Printing employee Names in Alphabetical order
		System.out.println("Employee names in Alphabetical order :");
		
		//Using Stream and for each method to print the names in Alphabetical order
		//Using sorted to print the values in alphabetical order
		//Using terminal operator :: as a part of Stream API.
		tree.values().stream().sorted().forEach(System.out :: println);
		}

}

//Output:
/*
 * Employee names in Alphabetical order :
Jeevan
Kumar
Mohan
Sugan
*/
