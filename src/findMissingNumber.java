import java.util.ArrayList;
import java.util.Arrays;


public class findMissingNumber {

			
	public static void main (String [] args)
	{
		int n = 11;
		int [] arrayInput ={1,2,5,3,8,6,9,10};
		int [] array = new int [n+1];
		int [] arrayOutput = new int [arrayInput.length];
		
		
		//initialize helper array to be 0
		for (int i=0; i<n; i++)
		{
			array[i] = 0;
		}
		
		
		//count the frequency of each element in the input
		for (int i=0; i<arrayInput.length; i++)
		{
			array[arrayInput[i]] = array[arrayInput[i]]+1;
		}
		
		for (int i=1; i<array.length; i++)
		{
			if (array[i] != 1)
			{
				System.out.println(i);
			}
		}
		
		//increment the count forward
		for (int i=1; i<n; i++)
		{
			array[i] = array[i] + array[i-1];
		}
		
		
		//put the correct position from count to the output array
		for (int i=(arrayInput.length -1); i>=0; i--)
		{
			arrayOutput[array[arrayInput[i]]-1] = arrayInput[i];
			array[arrayInput[i]] = array[arrayInput[i]]-1;
		}
		
		
	
		
		System.out.println(Arrays.toString(arrayOutput));
		
	}
}
