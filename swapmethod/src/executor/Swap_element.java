// write a program to swap the elements with respect to index by using add and collections method
package executor;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_element {

	public static void main(String[] args) {
		// create Array_list 
		ArrayList<String> a=new ArrayList<String>();
		//add elements into arraylist
		a.add("lalitha");
		a.add("mercy");
		a.add("aparana");
		//Display the elements using advanced forloop
		System.out.println("The elements of Array_lists are:");
		for(String b:a)
		{
			System.out.println(b);
		}
		//swap the elements with respect to index
		Collections.swap(a, 1, 2);
		//Display the elements using advanced forloop
				System.out.println("The elements swap of Array_lists are:");
				for(String b:a)
				{
					System.out.println(b);
				}
         
	}

}
