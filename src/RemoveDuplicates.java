import java.util.Arrays;


public class RemoveDuplicates {
	public static void main (String [] args)
	{
		int [] array = {1};
		int result = removeDuplicates(array);
		System.out.println(result);
	}
	
	 public static int removeDuplicates(int[] A) {
	        
		 int size = A.length;
		 
		    for (int i=0; i<size-1; i++)
		    {
		        if (A[i] == A[i+1])
		        {
		        	--size;
		            A = removeDup(A, i+1);
		        }
		    }
		    
		    return size+1;
		    }
		    
	 public static int []  removeDup(int [] A, int index)
		    {
		        for (int i=index; i<A.length-1; i++)
		        {
		            A[i] = A[i+1];
		        }		        
		        return A;
		    }
		       
}
