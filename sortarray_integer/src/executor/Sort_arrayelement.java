//write a program of arraylist to accept the data from user in the form of integer
package executor;

import java.util.Arrays;

public class Sort_arrayelement {

	public static void main(String[] args) {
		 
		
			//array define integer type 
			int[] array=new int[] {10,8,5,3,2,7,4,1,9};
			//sorting method
			Arrays.sort(array);
			System.out.println("Enter the integer into ascending order");
			//print the array 
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}

		}

	
	}


