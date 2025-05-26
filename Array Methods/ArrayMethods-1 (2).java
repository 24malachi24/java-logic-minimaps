import java.util.Arrays;
import java.util.Random;


public class ArrayMethods {

	//***NOTE that these methods will change the array itself
	 

	//part a, fill in this method
	public static void swapFirstAndLast(int[] values) {
		// save the first element to a temp var
		int temp = values[0];
		//move the last element to the first position
		values[0] = values[values.length-1];
		// now put the saved first element into the last position
		values[values.length-1] = temp;


	}

	//part b, fill in this method
	public static void shiftRight(int[] values) {
		int temp = values[values.length-1];// last element of the array. 
	    for(int i = values.length-1; i > 0; i--){ //Loop that shifts everything to the right.
	        values [i] = values[i-1];//
	}
	    values[0] =temp; // Switches the first value with the last so no repeats.
	}
	    	

	//part c, set all even elements to 0.
	public static void setEvensToZero(int[] values) {
		//Loops through the array
		for (int i =0; i< values.length; i++) {
			//Finds which ones are even and sets them to zero.
			if(values[i]%2==0) {
				values[i]=0;
			}
			if(values[i]/2==0) {
				values[i] =0;	
			}
// else makes sure that the evens are zero.
				else{
					values[i] = values[i];
				}
					}
				
			
			
			
		
		}
	

	//part d, replace each element except the first and last by larger of two 
	//around it
	public static void largerOfAdjacents(int[] values) {
		//Create a temporary array
		int[] temp = new int[values.length];
		// Handles the first element
		if(values[0]< values[1])
		temp[0] = values[1];
		//Loops through the array and gets the middle elements. 
		for(int i =1; i<values.length-1;i++){
			//Compares the values of the adjacents. The index is now 
			if(values[i-1] >values[i+1])
				temp[i] = values[i-1];
			else
				temp[i]=values[i+1];
			
		}
		//Handles the last elements.
		if(values[values.length-1]< values[values.length-2])
			temp[values.length-1] = values[values.length-2];
		// Set temp to the values.
		for( int i= 0; i<values.length; i++) {
			values[i] = temp[i];
			
		}
		

	}

	//part e, remove middle el if odd length, else remove middle two els.

	public static int[] removeMiddle(int[] values) {
		// Determines if the array has even length.
		boolean value_even = (values.length % 2 ==0);
		// Initialize new array based on if it is true or false 
		int[] temp;
		if(value_even)
			// Removing two elements if even
			temp = new int[values.length -2 ];
		else
			// Removes one element if odd.
			temp = new int[values.length-1];
		// The index variable of the middle two values.
		int middle = values.length / 2;
		int middle_2 = values.length / 2-1;
		
		int index = 0;
		// Loop through the value 
		for(int i = 0; i< values.length; i++)
		{
			//Checks if the index is correct to pull from.
			if(value_even &&(i == middle || i == middle_2))
				continue;
			else if(!value_even && i == middle)
				continue;
			//assigning  the value.
		temp[index]= values[i];
		index ++;
		}
		//replace the following line with your answer
		//this line needed to compile
		return temp;
	}

	//part f - move all evens to front
	public static void moveEvensToFront(int[] values) {
		// Creating a temporary array
		int[] temp = new int[values.length];
		// Counts the even numbers.
		int counter = 0;
		//Counts the odd numbers 
		int odd = values.length -1;
		// Loops through every index.
		for (int i = 0; i< values.length; i ++)
		{
			//IF even iterate the counter.
			if(values[i]%2 == 0) {
				temp[counter]= values[i];
				counter++;
			}
			// If odd iterate the odd counter
			else {
				temp[odd] = values[i];
				odd--;
			}
		}
		// Assign temp to values.
	for(int i =0; i<temp.length; i++)
	{
		values[i]=temp[i];
	}
	}

	

	//part g - return second largest element in array
	public static int ret2ndLargest(int[] values) {
		// Sort array. The largest value is the last index.
		int[] temp = values.clone();
		Arrays.sort(temp);
		//Must iterate from the top down. 
		for(int i = temp.length -1; i>0; i--) {
			// Checks if the last element is equal to the current.
			if(temp[temp.length-1]!= temp[i]) {
				//Makes the second largest value.
				return temp[i];
			}
		}
		return 0; 
	}

	//part H - returns true if array is sorted in increasing order 
	public static boolean isSorted(int[] values) {
		// 
		for(int i =0; i < values.length-1; i++) {
			// Checks if current value is greater than next value. 
			if(values[i]> values[i+1]) {
				return false;
			}
		}
		return true;
	}
	

		

	//PART I - return true if array contains 2 adjacent duplicate values

	public static boolean hasAdjDuplicates(int[] values) {
		// Finds duplicates by checking if each element is the same as the next one.
		for(int i =0; i < values.length-1; i++) {
			if(values[i] == values[i + 1]) {
				return true;
				// returns true if they are the same.
			}
		}
		return false; //dummy return value
	}


	//PART J - return true if array contains 2 duplicate values
	//duplicates need not be adjacent to return true

	public static boolean hasDuplicates(int[] values) {
		//Loops through all elements.
		for(int i =0; i < values.length; i++) {
			for(int j = i+1; j < values.length; j++) {
			if(values[i]== values[j]) {
				// If any elements are the same it returns true.
				return true;
	}
			}
		}
			return false; 
	}
}
			
		
		
		
		
		
	
	





