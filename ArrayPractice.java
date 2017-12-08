
public class ArrayPractice 
{
	private int[] array;
	public ArrayPractice()
	{
		//initialize an int[] array with 50 elements and fill in the array elements by calling initArray.
		array = new int[50];
		initArray();
	}
	/**
	 * This method should iterate over the array
	 * and initialize each element of the array with a random int between 1 and 20 inclusive.
	 */
	public void initArray()
	{
		for(int index = 0; index < array.length; index++)
		{
			array[index] = (int)(Math.random() *20) + 1;
		}
	}
	/**
	 * This method gets the value of an element in the array at a given index.
	 * @param index The index of an element in the array.
	 * @return The value of the element at the given index. 
	 */
	public int getByIndex(int index)
	{
		return array[index];
	}
	/**
	 * This method should iterate over the array and calculate the average value of the elements. 
	 * @return The average value of the elements in the array.
	 */
	public double average()
	{
		int sum = 0;
		for(int index = 0; index < array.length; index++)
		{
			sum += array[index];
		}
		return (double) sum/array.length;
	}
	/**
	 * This method should find the index of the maximum element in the array. 
	 * @return The index of the maximum valued element in the array.
	 * If there are multiple maximal values then the index of the first one should be returned.
	 */
	public int indexOfMaxValue()
	{

		int max = array[0];
		int index = 0;

		for (int num = 0; num < array.length; num++) 
		{
			if (max < array[num]) 
			{
				max = array[num];
				index = num;
			}
		}
		return index;
	}
	
	/**
	 * This method should return an array that contains the indexes of all of the even array elements.
	 * The array should only be as big as necessary to contain all of the even numbers.
	 * @return An int[] array containing the indexes of the even valued elements.
	 */
	public int[] indexesOfEvens()
	{
		int count = 0;
		for(int index = 0; index < array.length; index++)
		{
			if(array[index]%2 == 0)
			{
				count++;
			}
		}
		int[] evens = new int[count];
		count = 0;
		for(int index = 0; index < array.length; index++)
		{
			if(array[index]%2 == 0)
			{
				evens[count] = index;
				count++;
			}
		}
		return evens;
	}
	/** This method should return a formatted String of the array data.
	 * @return A nicely formatted String.
	 */
	@Override
	public String toString()
	{
		String ret = "[";
		for(int index = 0; index < array.length; index++)
		{
			ret += array[index];
			if(index < array.length - 1)
			{
				ret += ", ";
			}
		}
		return ret + "]";
	}
}
