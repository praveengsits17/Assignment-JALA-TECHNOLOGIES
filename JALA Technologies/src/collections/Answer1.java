package collections;

import java.util.ArrayList;
import java.util.Iterator;

// Program on ArrayList.

public class Answer1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(); // Creating a arraylist with 10 elements.
	
		// adding element to the arraylist.
		list.add("Praveen");
		list.add("Kumawat");
		list.add("likes");
		list.add("Java");
		list.add("coding");
		list.add("need");
		list.add("proper");
		list.add("guidance");
		list.add("enhance");
		list.add("knowledge");
		
		//===================================================//
		
		//Iterate through the ArrayList by using Iterator object
	
		Iterator itr = list.iterator();
		
		System.out.println("Iterating through ArrayList elements");
		
		while(itr.hasNext())
			//System.out.println(itr.next());
		
		//==================================================//
		
		//Add an element at a specific index
		
		list.add(3, "is a boy"); // method been used to add element at a given index.
		
		//=================================================//
		
		//Remove an element at a specific index
		
		System.out.println(list.remove(2)); // Removing element from arraylist from a specific index . Index is been passed as a parameter.
	
		//================================================//
		
		//Update an element at an specific index
		
		System.out.println(list.set(4, "Kumawat")); // Update the element at the specific position , index and string been passed as a parameter.
		
		//===============================================//
		
		//Check the element is present at a particular index
		
		System.out.println(list.indexOf(null)); // Pass the value of String to be tested wether present in the list or not. 
		
		//===============================================//
		
		// Get an element at a particular index
		
		System.out.println(list.get(4)); // method is been used to find the element at a particular index.
		
		//==============================================//
		
		//Find out the size of the ArrayList
		
		System.out.println(list.size()); // method is been used to return the size of the arraylist.
		
		//=============================================//
		
		// Check the given element is present in the ArrayList
		
		System.out.println(list.contains(null)); // Pass the parameter in place of null , and find wether the following element is present in the arraylist or not.
		
		
		// Remove all elements of the ArrayList
		
		list.clear(); // Method is been used to clear the given array list.
	}
}
	

