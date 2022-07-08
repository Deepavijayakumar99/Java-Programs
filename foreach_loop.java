//write a program Use of For_each() method to iterate the element 
				 

package executor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Loops_concept{
	public static void main(String[] args) 
		    {
		        //Creating object for the class
		    List<Integer> l=new ArrayList<Integer>();
		    //Adding elements using add method by for loop
		    for(int i=0;i<20;i++)
		        l.add(i);
		    //Iterate the elements using Iterator
		    Iterator<Integer> i=l.iterator();
		    while(i.hasNext())
		    {
		        Integer i1=i.next();
		        System.out.println("the values are: "+i1);
		    }
		    //using for_each method
		    l.forEach(new Consumer<Integer>()
		    {
		        public void accept(Integer i2)
		        {
		            System.out.println("The value of foreach mtd:"+i2);
		        }

		 

		    });
		    }
		    

		 

		
	}

