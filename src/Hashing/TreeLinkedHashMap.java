/*
// Java program to print ordering of all elements using HashMap 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
class Main 
{ 
	// This function prints ordering of all elements 
	static void insertAndPrint(AbstractMap<Integer, String> map) 
	{ 
		int[] array= {1, -1, 0, 2,-2}; 
		for (int x: array) 
		{ 
			map.put(x, Integer.toString(x)); 
		} 
		for (int k: map.keySet()) 
		{ 
			System.out.print(k + ", "); 
		} 
	} 

	// Driver method to test above method 
	public static void main (String[] args) 
	{ 
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
		insertAndPrint(map); 
	} 
}
*/

/*
// Java program to print ordering of all elements using LinkedHashMap 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Main 
{ 
	// This function prints ordering of all elements 
	static void insertAndPrint(AbstractMap<Integer, String> map) 
	{ 
		int[] array= {1, -1, 0, 2,-2}; 
		for (int x: array) 
		{ 
			map.put(x, Integer.toString(x)); 
		} 
		for (int k: map.keySet()) 
		{ 
			System.out.print(k + ", "); 
		} 
	} 
	
	// Driver method to test above method 
	public static void main (String[] args) 
	{ 
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(); 
		insertAndPrint(map); 
	} 
}
*/

/*
// Java program to print ordering of all elements using TreeMap 

import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Main 
{ 
	// This function prints ordering of all elements 
	static void insertAndPrint(AbstractMap<Integer, String> map) 
	{ 
		int[] array= {1, -1, 0, 2,-2}; 
		for (int x: array) 
		{ 
			map.put(x, Integer.toString(x)); 
		} 
		for (int k: map.keySet()) 
		{ 
			System.out.print(k + ", "); 
		} 
	} 

	// Driver method to test above method 
	public static void main (String[] args) 
	{ 
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); 
		insertAndPrint(map); 
	} 
}
*/
