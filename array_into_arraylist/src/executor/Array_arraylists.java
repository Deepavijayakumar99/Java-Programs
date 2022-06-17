// write a program to convert array into array_list by using array.aslist,collections.addall,manual convert array to array_list:
package executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array_arraylists {

	public static void main(String[] args) {
		//Initialize the array at compile time
		String student[]= {"lalitha","aparana","mercy"};
		// convert into array_list
		ArrayList<String> s=new ArrayList<String>(Arrays.asList(student));
		s.add("kishore");
		
		//display the elements
		System.out.println("The elements of arraylist using method1 are:");
		for(String b:s)
		{
			System.out.println(b);
		}
		//using collections 
		Collections.addAll(s,student);
		s.add("preethi");
		//display the collection elements
		System.out.println("The elements of arraylist using collection are:");
		for(String b:s)
		{
			System.out.println(b);
		}
		for(int i=0;i<student.length;i++)
			//convert into  array_list using object
			s.add(student[i]);
		// display the elements
		System.out.println("The elements of arraylist using manualmethod are:");
		for(String b:s)
		{
			System.out.println(b);
		}
		
		
	}

}
