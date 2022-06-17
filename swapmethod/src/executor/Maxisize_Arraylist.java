//write a program to increase the size of array_list
package executor;

import java.util.ArrayList;
import java.util.Collections;

public class Maxisize_Arraylist {

	public static void main(String[] args) {
		// create Array_list 
				ArrayList<String> a=new ArrayList<String>();
				//add elements into array_list
				a.add("lalitha");
				a.add("mercy");
				a.add("aparana");
				//Display the elements using advanced for loop
				System.out.println("The elements of Array_lists are:");
				for(String b:a)
				{
					System.out.println(b);
				}
		         // to increase the size of array_list
						a.ensureCapacity(4);
						a.add("preetha");
						a.add("elango");
						//Display the elements using advanced for loop
						System.out.println("The elements to increase size of Array_lists are:");
						for(String b:a)
						{
							System.out.println(b);
						}

			}

		
		

	}


