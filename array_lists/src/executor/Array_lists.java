//write a program to iterate the elements of arraylists using multiple way
package executor;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_lists {

	public static void main(String[] args) {
		//create an object for array_lists class
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(330);
		a.add(45);
		a.add(56);
		//using normal loop
		System.out.println("The elements of arraylist using for loop:");
		//using normal loop
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			
		}
		//using advanced for loop
		System.out.println("The elements of arraylist using advanced for loop");
		for(Integer element:a)
		{
			System.out.println("The elements using advanced loop:"+element);
			
		}
		//using while loop
		System.out.println("The elements of arraylist using while loop:");
		//Initialize the 1st index
		int num=0;
		while(a.size()>num)
		{
			System.out.println(a.get(num));
			num++;
		}
		//using iterator
		System.out.println("The elements of arraylist using iterator");
		Iterator it=a.iterator();
		while(it.hasNext())//hasnext()to iterate the element from array_list
		{
			System.out.println(it.next());//next() to display the elements from array_list
		}

	}

}
