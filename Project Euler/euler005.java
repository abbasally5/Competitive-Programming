public class euler5
{
	public static void main(String []args)
	{
        long num = 20;
	    while (!isDiv(num))
	    {            
			num += 20;        
		}
	    System.out.println(num);
	    long num2 = 1;
	    for (int i = 1; i <= 20; i++)
	    {
	    	num2 *= i;
	    }
	    System.out.println(num2);
	}     
    
	static boolean isDiv(long l)     
	{        
		for (int i = 1; i <= 20; i++)        
		{            
			if (l % i != 0) return false;        
		}        
		return true;     
	}
}