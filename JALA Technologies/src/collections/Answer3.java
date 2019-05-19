package collections;

import java.util.HashSet;
import java.util.Iterator;

//HashSet Programme.

public class Answer3 {
	public static void main(String args[]) 
	{
		// Creating HashSet and adding elements

		HashSet<String> hset = new HashSet(); 
		hset.add("One"); // Adding the Strings to the set.
		hset.add("Two");
		hset.add("Three");
		hset.add("Four");
		hset.add("Five");
		hset.add("Six");
		hset.add("Seven");
		hset.add("Eight");
		hset.add("Nine");
		hset.add("Ten");
		
		Iterator<String> i = hset.iterator(); // Iterating over the set.
		while (i.hasNext())
		{
			System.out.println(i.next()); // Printing the values in the Hashset.
		}
		
		//===========================================================//
		
		// Adding new elements to the Hashset.
		
		hset.add("Eleven"); // Used to add the element to the Hashset , if it is not present previously.

		//==========================================================//
		
		// Removing all the elements from the HashSet.
		
		hset.clear();// Used to remove all elements from the HashSet.
	
		//=========================================================//
		
		// Creating the copy of the Hashset .
		
		hset.clone(); //  used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
	
		//=========================================================//
		
		// To check wether following element is present in the set or not.
		
		hset.contains("Nine"); // used to return true if this set contains the specified element.
	
		//========================================================//
		
		// To check wether the given hashset is empty or not.
		
		hset.isEmpty() ; //  used to return true if this set contains no elements.
		
		//=======================================================//
	
		// To remove a followig element from the Hashset.
		
		hset.remove("Five"); // used to remove the specified element from this set if it is present.
		
		//======================================================//
		
		// To return the size of the Hashset.
		
		hset.size(); // Used to return the size of the HashSet.
		
		//=====================================================//
	}

}
