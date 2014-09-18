import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import static java.lang.System.*;

class euler003
{
	public void run()
	{
		long num = 600851475143L;		
		long max = 0;
		long i  = (long)Math.sqrt(num) + 1;
		out.println(i);
		for (;i > 0; i-= 2)
		{
			//out.println(i);
			//count = count.subtract(new BigInteger("1"));
			//if (i.mod(new BigInteger("1000")).equals(new BigInteger("0"))) out.println(i);
			if (num % i == 0)
			{
				if (isPrime(i))
				{
					max = i;
					break;
				}								
			}
		}
		out.println(max);
				
	}
	
	boolean isPrime(long l)
	{
		//if (b.mod(new BigInteger("2")).equals(new BigInteger("0"))) return false;
		long sqrt = (long) Math.sqrt(l);
 		for (long i = 3; i < sqrt; i += 2)
		{
			if (l % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String... args)
	{
		new euler003().run();
	}
}