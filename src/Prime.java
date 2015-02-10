
public class Prime {

	
	public static void main (String [] args)
	{		
		int i=0;
		int counter=0;
		while (i<10002)
		{
			counter++;
			if(isPrime(counter))
			{
				i++;
			}
		}
		System.out.println(counter);
	}
	public static boolean isPrime(int n)
	{
		for (int i=2; i<n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
