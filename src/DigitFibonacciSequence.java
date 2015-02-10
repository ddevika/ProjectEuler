import java.math.*;
import java.util.Arrays;


public class DigitFibonacciSequence {

	public static void main (String [] args)
	{
		int counter =0;
		BigInteger result = new BigInteger("0");
		
		//while (result.toString().length() < 1000)
		//{
		//	result = fibDP(counter++);
		//}
		
		
		System.out.println(counter-1);
		int [] array = {1,2,4,5};
		
		moveColumn(array,3, 1);
		
	}
	
	public static BigInteger fibDP(int n)
	{
		int i;
		BigInteger n2= new BigInteger("1");
		BigInteger n1= new BigInteger("1");
		BigInteger current = new BigInteger("2");
		
		for (i=3; i<=n; i++)
		{
			current = n1.add(n2);
			n2=n1;
			n1=current;
		}
		
		
		return current;
	}
	
	public static void moveColumn(int [] array, int start, int end)
	{
	   int [] temp = new int [array.length];
	   temp[end] = array[start]; //temp array holds the correct position of column
	   
	   for (int i=0; i < end; i++)
	    {
	      temp[i] = array[i];
	    }
	   
	    for (int j=end; j<array.length-1; j++)
	    {
	      temp[j+1] = array[j]; 
	    }
	    
	    System.out.println(Arrays.toString(temp));
	}
	 
	
}

