package collections;

import java.util.HashMap;

// Program created on HashMap and understanding its methods.//

public class Answer2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		HashMap<Integer, String> newhmap = new HashMap<Integer, String>();

		System.out.println("Initial elements of HashMap are : ");

		// Creating a HashMap with 10 elements.

		hmap.put(1, "Aditya");
		hmap.put(2, "Akash");
		hmap.put(3, "Bhushan");
		hmap.put(4, "Cassie");
		hmap.put(5, "Devendra");
		hmap.put(6, "Darshit");
		hmap.put(7, "Aayushi");
		hmap.put(8, "Praveen");
		hmap.put(9, "Tony");
		hmap.put(10, "Abhishek");

		System.out.println(hmap); // Used to print the elements in the Hashmap.
		// =============================================//

		// Insert a Key value mapping into the map

		hmap.put(11, "Gourav"); // method is been used to add new key value pair in a Hashmap.

		// =============================================//

		// Fetch the value of a Key.

		String s = hmap.get(1);
		System.out.println(s);

		// ============================================//

		// Create a clone/copy of HashMap

		newhmap = (HashMap) hmap.clone(); // Type casting is been done to convert it into hashmap.
		System.out.println(newhmap); // Printing the element of the hashmap.

		// ============================================//

		System.out.println(hmap.containsKey(1)); // Pass the key value of key to be found in the hashmap.
													// Returns elements as true or false.

		// =============================================//

		System.out.println(hmap.containsValue("Praveen")); // Pass the key value to be found in the hashmap.

		// =============================================//

		// Checks wether the map is empty or not.

		System.out.println(hmap.isEmpty()); // Returns wether the given hashmap is empty or not.

		// =============================================//

		// Finding the size of the Hashmap.

		System.out.println("The size of the Hashmap is " + hmap.size()); // method is been used to find the size of the
																			// HashMap.

		// ============================================//

		// Printing the values of the key of the Hashmap on the console.

		for (Integer studentId : hmap.keySet()) // Using for eachloop to iterate over the hashmap
		{
			String key = studentId.toString(); // Converting the key to the String.
			System.out.println(key + " ");
		}

		// ============================================//

		// Remove a specific Key-value pair

		hmap.remove(1, "Aditya"); // Method is been used to remove the key value pair from a Hashmap.

		// ===========================================//

		// Copy all the elements of the Map to another Map

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();

		hmap2 = (HashMap<Integer, String>) hmap.clone(); // Casting is done , and creating the copy of the Hashmap.

		System.out.println("Printing the copied Hashmap : " + hmap2);

	}
}
