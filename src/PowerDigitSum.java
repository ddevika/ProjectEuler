import java.math.*;


public class PowerDigitSum {

	public static void main (String [] args)
	{
		BigInteger sum, pow;
		sum = new BigInteger("2");
		pow = sum.pow(1000);
				
		String pow_str = pow.toString();
		long result =0;
		
		for (int i=0; i<pow_str.length(); i++)
		{
			result += Integer.valueOf(String.valueOf(pow_str.charAt(i)));
		}
		
		System.out.println(result);
	}
}
