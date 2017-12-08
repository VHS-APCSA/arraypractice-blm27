public class ArrayPracticeRunner {
	public static void main(String[] args)

	{
		ArrayPractice ap = new ArrayPractice();
		System.out.println("INDEX: " + ap);
		System.out.println("The average of the index is: " + ap.average());
		System.out.println("The index of the max value is: " + ap.indexOfMaxValue());
		int[] even = ap.indexesOfEvens();
        System.out.println("Index of all evens: " + printArray(even));
	}
		 public static String printArray(int[] array)
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