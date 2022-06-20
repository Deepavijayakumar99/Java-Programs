//write a program of arraylist to accept the data from user in the form of integer
package executor;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_arraylist {

	public static void main(String[] args) {
		
	        // Define an objects of ArrayList class
	        ArrayList<Integer> list = new ArrayList<Integer>();
	 
	        // Adding elements to the ArrayList
	        list.add(10);
	        list.add(50);
	        list.add(44);
	        list.add(97);
	        list.add(29);
	        list.add(15);
	 
	        // Printing the unsorted ArrayList
	        System.out.println("Before Sorting : " + list);
	 
	        // Sorting ArrayList in descending Order
	        Collections.sort(list, Collections.reverseOrder());
	 
	        // Printing the sorted ArrayList
	        System.out.println("After Sorting : " + list);
	    }
	
	}


