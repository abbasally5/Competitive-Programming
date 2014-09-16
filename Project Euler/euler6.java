public class euler6
{     
	public static void main(String []args)     
	{       
		long num1 = 0;       
		long num2 = 0;       
		for (int i = 1; i <= 100; i++)       
		{           
			num1 += (long)Math.pow(i,2);           
			num2 += i;       
		}       
		num2 = (long)Math.pow(num2,2);       
		System.out.println(num2-num1);     
	}
}